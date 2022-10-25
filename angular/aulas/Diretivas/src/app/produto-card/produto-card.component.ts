import { Component, EventEmitter, Input, Output} from '@angular/core';
import { produto } from '../produto';

@Component({
  selector: 'app-produto-card',
  templateUrl: './produto-card.component.html',
  styleUrls: ['./produto-card.component.css']
})
export class ProdutoCardComponent  {
  //TEM LIGACAO COM A INTERFACE PRODUTO.TS
  //LEMBRE SEMPRE DE IMPORTAR O INPUT LA EM CIMA

  //produto é a interface
  //prod é o objeto
@Input()
prod: produto = 
{
  nome: "",
  imagem: "",
  preco: 0,
  estoque: 0,
  descricao: "",
}
  mostrarProduto: boolean = true //MOSTRAR PRODUTO  JA COMEÇA VERDADEIRO

  //CRIEI UM EVENTO PERSONALIZADO
  @Output() //COMPONENT FILHO ENVIA MENSAGEM PARA O PAI OU SEJA, DO COMPONENTE PRODUTO PARA O COMPONENTE APP PADRÃO
  deletar : EventEmitter<produto> = new EventEmitter() //DELETAR E O MEU EVENTO PERSONALIZADO



  esconderProduto() : void {
    this.mostrarProduto = false
  }

  aparecerProduto() : void{
      this.mostrarProduto = true
  }

  //QUANDO EMITIR O EVENTO DELETAR SERÁ DELETADO O CONTEÚDO QUE ESTÁ DENTRO DA PROPRIEDADE PROD
  emitirEventoDeletar(): void {
    this.deletar.emit(this.prod)
  }

}
