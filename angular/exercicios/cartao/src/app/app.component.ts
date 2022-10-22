import { Component, Input } from '@angular/core';
import { CartaoCredito } from './interfaces/CartaoCredito';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  
  cartao: CartaoCredito={
    ano:"",
    cvc:"",
    mes:"",
    nome:"",
    numero:""
  }
}
