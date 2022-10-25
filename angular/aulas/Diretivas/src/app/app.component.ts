import { Component } from '@angular/core';
import { produto } from './produto';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {

  nome: string = '';
  imagem: string = '';
  preco: number = 0;
  estoque: number = 0;
  descricao: string = '';
  //Criou propriedade p do tipo produto
  //Esse p foi excluido para criarmos um array de produtos
  //listaProdutos  é a minha variável do tipo array
  //produto é minha interface
  listaProdutos: produto[] = []


  adicionarProduto(evento: any): void {
    console.log(evento)
    evento.preventDefault()
    //evita que forms seja enviado
    //faz com que o comportamento padrão de um elemento seja anulado
    //nesse caso ao clicar no botao do forms
    evento.stopPropagation()
    //para evitar que o evento propague por outros componentes html
    console.log(this.listaProdutos)
    this.listaProdutos.push({

      nome: this.nome,
      imagem: this.imagem,
      preco: this.preco,
      estoque: this.estoque,
      descricao: this.descricao,

    })
  }
  //indexOf qual a posicao dentro do array
  deletarProduto(p: produto): void{
    const index = this.listaProdutos.indexOf(p)
      this.listaProdutos.splice(index, 1)
  }

}
