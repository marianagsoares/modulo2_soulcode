import { Component, OnInit } from '@angular/core';
import { ClientesService } from './services/clientes.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {
  title = 'services';
  constructor(
    public cService: ClientesService
    //injecao de dependencia sempre e feita dentro do construtor
  ){}
    ngOnInit(): void {
      // basta o metodo exisitir dentro da classe para que o ciclo de vida do componente seja executado
      this.cService.listarClientes()
    }
}
