import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { IFilmes } from '../interfaces/interfaces';

@Injectable({
  providedIn: 'root'
})
export class tmdbService {

  constructor(
    private http: HttpClient
  ) { }

  private readonly baseUrl: string =  "https://api.themoviedb.org/3/search/movie?api_key=95815bc63b3fb3fb900bc307263b99b7&language=pt-BR&page=1&query="

  consumirApi(nome: string){
    return this.http.get<IFilmes>(`${this.baseUrl}${nome}`)
  }


}
//https://api.themoviedb.org/3/movie/now_playing
//CAMINHO para a API search movie
//https://www.themoviedb.org/
//logar/criar conta
//definições
//API
//copiar chave da API
//Clicar em mais na barra de navegação
//API
//API Documentation
//Clicar em GET search na barra de navegação lateral
//search movie
