import { Component, Input} from '@angular/core';
import { produto } from '../produto';

@Component({
  selector: 'app-produto-card',
  templateUrl: './produto-card.component.html',
  styleUrls: ['./produto-card.component.css']
})
export class ProdutoCardComponent  {
  //TEM LIGACAO COM A INTERFACE PRODUTO.TS
  //LEMBRE SEMPRE DE IMPORTAR O INPUT LA EM CIMA

@Input()
prod: produto = 
{
  nome: "",
  imagem: "",
  preco: 0,
  estoque: 0,
  descricao: "",
}

}
