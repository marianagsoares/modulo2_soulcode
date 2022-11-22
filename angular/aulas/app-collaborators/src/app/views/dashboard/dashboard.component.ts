import { Component, OnInit } from '@angular/core';
import { Collaborator } from 'src/app/models/collaborator';

@Component({
  selector: 'app-dashboard',
  templateUrl: './dashboard.component.html',
  styleUrls: ['./dashboard.component.css']
})
export class DashboardComponent implements OnInit {

  constructor() { }
  
  ngOnInit(): void {
  }

  displayedColumns = [ "foto","nome","email","cpf","cargo","setor","excluir", "editar", "detalhes" ]
  dataSource: Collaborator[] =[{
    nome: "teste",
    cpf: "teste",
    dataNascimento: new Date(),
    cargo: "teste",
    setor: "teste",
    remuneracao: 1000,
    estado: "teste",
    cidade: "teste",
    email: "teste",
    fotoUrl: "aaa"
  }];

}
