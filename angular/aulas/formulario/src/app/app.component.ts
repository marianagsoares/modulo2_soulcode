import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'formulario';
  dadosUsuario = {
    nome: "",
    sobrenome: "",
    email: "",
    senha:""
  }

  doSomething(){
  }
}
