import { Component } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
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

  constructor(
    private fb: FormBuilder,
    private githubService:  GitHubService
  ) {}

  procurar () {
    const username = this.githubForm.get('username')?.value //recuperando o nome de usuário que deve ser procurado
    this.githubService.procurarUsuario(username).subscribe(
      (user: any) => {
        this.gUser = user
      }
    )
    
  }
}