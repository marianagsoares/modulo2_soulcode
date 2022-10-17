import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  tarefaInserida: string="";
  listaTarefas: string[] = [];

  adicionar(){
    this.listaTarefas.push(this.tarefaInserida)
  }
}

//TAREFA INSERIDA É O QUE O USUARIO DIGITA
//listaTarefas E O ARRAY E ONDE SERA ADICIONAR O QUE O USUARIO DIGITAR
//TAREFAS ATUALIZA A LISTA DE ARRAYS E É O INPUT DO COMPONENTE DE TO-DO
