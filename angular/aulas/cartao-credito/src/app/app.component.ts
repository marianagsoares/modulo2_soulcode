import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'cartao-credito';
//Valores que usuários irão digitar
  nome: string = "";; 
  numero: string = "";
  mes: string = "";
  ano: string = "";
  cvc: string = "";

}