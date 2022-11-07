
import {HttpClient} from '@angular/common/http';
import { Injectable } from '@angular/core';
import { GitHubRepo } from '../GitHubRepo';
import { GitHubUser } from '../GitHubUser';
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
    return this.http.get<GitHubUser>(`${this.baseURL}${username}`)
    //https://api.github.com/users/renato3x
    //para fazer uma requisicao htttp
    //O angular utiliza o observable para fazer as requisições http seja qual for o método http que for utilizado.
  }
  procurarRepos(username: string){
    return this.http.get<GitHubRepo[]>(`${this.baseURL}${username}`)
    //git repo e o nome da interface que nos criamos
  }
}
