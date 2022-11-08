import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Produto } from '../models/Produto';

@Injectable({
  providedIn: 'root'
})
export class ProdutoApiService {

  private readonly baseUrl: string = "http://localhost:3000/produtos"
  constructor(
    private http: HttpClient
  ) { }

ListarProdutos() {
  return this.http.get<Produto[]>(this.baseUrl)
  }
}
