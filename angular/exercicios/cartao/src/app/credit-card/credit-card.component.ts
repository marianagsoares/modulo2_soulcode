import { Component , Input} from '@angular/core';
import { CartaoCredito } from '../interfaces/CartaoCredito';

@Component({
  selector: 'app-credit-card',
  templateUrl: './credit-card.component.html',
  styleUrls: ['./credit-card.component.css']
})
export class CreditCardComponent  {
  
  @Input()
  dadosCartao: CartaoCredito={
    ano:"",
    cvc:"",
    mes:"",
    nome:"",
    numero:""
  }

}
