import { Component } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { IFilmes } from './interfaces/interfaces';
import { tmdbService } from './services/tmdb.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'AppFlix';

  constructor(
    private formBuilder: FormBuilder,
    private tmdbService: tmdbService
    ){}

    formulario: FormGroup = this.formBuilder.group({
      inputUser: ["", [Validators.required]]
    })

    returnApi!: IFilmes

  pesquisar(){
      const nomeFilme = this.formulario.get("inputUser")?.value
      console.log(nomeFilme)

      this.tmdbService.consumirApi(nomeFilme).subscribe((filmeRetornado) => {
        this.returnApi = filmeRetornado
      })
  }
}
