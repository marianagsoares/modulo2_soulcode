import { HttpErrorResponse } from '@angular/common/http';
import { Component } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { MatSnackBar } from '@angular/material/snack-bar';
import { GitHubRepo } from './GitHubRepo';
import { GitHubUser } from './GitHubUser';
import { GitHubService } from './service/git-hub.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  githubForm: FormGroup = this.fb.group({
    username: ['', [ Validators.required ]]
  })

  gUser!: GitHubUser
  repos: GitHubRepo[] = []
  constructor(
    //esse construtor e o mesmo que o autowried no java
    private fb: FormBuilder,
    private githubService:  GitHubService,
    private snackBar : MatSnackBar // compoenente do material para mostrar mensagens
  ) {}

  procurar () {
    const username = this.githubForm.get('username')?.value //recuperando o nome de usuário que deve ser procurado
    /**
     * Ordem das funções dentro do Subscribe
     * 1. sucesso
     * 2. erro
     * 3. completo
     */
    
    this.githubService.procurarUsuario(username).subscribe(
      (user) => {
        this.gUser = user
      },
      (erro) =>{
          //httpErrorResponse
          //preciso saber se o meu erro vem da classe httpErrorResponse
          //O meu objeto erro é uma instancia da minha classe 
          if (erro instanceof HttpErrorResponse){
            if(erro.status == 404)
              this.snackBar.open(`Usuario ${username} nao encontrato`) // abrindo o snackbar na tela
          }
        }
    )

    this.githubService.procurarRepos(username).subscribe(
      (repositorio) => {
        this.repos = repositorio
      })
  }
}