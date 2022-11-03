import { Component } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
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

  constructor(
    private fb: FormBuilder,
    private githubService: GitHubService // é ele quem faz as requisicoes http pra gente
  ) {}

  procurar(){
    const username = this.githubForm.get('username')?.value
    this.githubService.procurarUsuario(username).subscribe(
      (user) =>
      console.log(user)
    )
  }
}
