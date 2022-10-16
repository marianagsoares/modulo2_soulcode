//todos os componentes do angular são representados por uma classe

import { Component, Input } from "@angular/core";

@Component({
  selector: 'card-produto',
  templateUrl: './produto.component.html',
  styleUrls: ['./produto.component.css']
})

export class ProdutoComponent{
  @Input() imgSrc: string = ""; //para string inicializa ""
  @Input() imgSrc2: String = "";
  @Input() imgSrc3: String = "";
  @Input() preco: number = 0; //para number inicializa 0
  @Input() nome: string = "";
  @Input() referencia: string = "";
  @Input() carousel: string = "";
}