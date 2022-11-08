import { Component, OnInit } from '@angular/core';
import { Produto } from 'src/app/models/Produto';
import { ProdutoApiService } from 'src/app/services/produto-api.service';

@Component({
  selector: 'app-listar-produtos',
  templateUrl: './listar-produtos.component.html',
  styleUrls: ['./listar-produtos.component.css']
})
export class ListarProdutosComponent implements OnInit {

  constructor(
    private produtoService: ProdutoApiService
  ) { }

  ngOnInit(): void {
    this.produtoService.ListarProdutos().subscribe( (prods) => {
      console.log(prods)
    })
  }

}
