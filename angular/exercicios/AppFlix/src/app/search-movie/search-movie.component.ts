import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { MatSnackBar } from '@angular/material/snack-bar';
import { IFilmes } from '../interfaces/interfaces';
import { tmdbService } from '../services/tmdb.service';


@Component({
  selector: 'search-movie',
  templateUrl: './search-movie.component.html',
  styleUrls: ['./search-movie.component.css']
})
export class SearchMovieComponent {

  title = 'AppFlix';

  constructor(
    private formBuilder: FormBuilder,
    private tmdbService: tmdbService,
    private snackBar: MatSnackBar
    ){}

    formulario: FormGroup = this.formBuilder.group({
      inputUser: ["", [Validators.required]]
    })

    returnApi!: IFilmes

  pesquisar(){
      const nomeFilme = this.formulario.get("inputUser")?.value
      console.log(nomeFilme)

      this.tmdbService.consumirApi(nomeFilme).subscribe((filmeRetornado) => {
        if(filmeRetornado.results.length == 0){
          this.snackBar.open("Não existem Filmes que correspondam à sua busca.", "fechar")
        }else{
          this.returnApi = filmeRetornado
        }
      })
  }

}
