import { Component, Input } from '@angular/core';

@Component({
  selector: 'app-credit-card',
  templateUrl: './credit-card.component.html',
  styleUrls: ['./credit-card.component.css']
})
export class CreditCardComponent {

  @Input() nomeCardEsperaReceber: string = "";
  @Input() numeroCardEsperaReceber: string = "";
  @Input() mesCardEsperaReceber: string = "";
  @Input() anoCardEsperaReceber: string = "";
  @Input() cvcCardEsperaReceber: string = "";

}
