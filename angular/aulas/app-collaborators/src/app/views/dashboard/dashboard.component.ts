import { Component, OnInit } from '@angular/core';
import { Collaborator } from 'src/app/models/collaborator';
import { CollaboratorService } from 'src/app/services/collaborator.service';

@Component({
  selector: 'app-dashboard',
  templateUrl: './dashboard.component.html',
  styleUrls: ['./dashboard.component.css']
})
export class DashboardComponent implements OnInit {

  constructor(
    private CollaboratorService: CollaboratorService
  ) { }
  
  ngOnInit(): void {
    this.initializeTable()
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

  private initializeTable(): void{
    this.CollaboratorService.findAll().subscribe(collaborators =>{
        this.dataSource = collaborators
    })
  }
}
