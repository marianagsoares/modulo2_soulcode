
import {HttpClient} from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class GitHubService {

private readonly baseURL: string = "https://api.github.com/users/"

constructor(
  private http: HttpClient
  ) { }

  //Metodos HTTP
  //leitura de dados = GET
  //Criacao de dados = POST
  //Atualizacao de dados = PUT
  //Delecao de dados = DELETE
  procurarUsuario(username: string){ /*renato3x*/
    //this.http.get(this.baseURL + userName)
    return this.http.get(`${this.baseURL}${username}`)
    //https://api.github.com/users/renato3x
    //para fazer uma requisicao htttp
    //O angular utiliza o observable para fazer as requisições http seja qual for o método http que for utilizado.
  }
}
