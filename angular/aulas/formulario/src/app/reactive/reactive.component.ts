import { Component } from '@angular/core';
import { FormControl, FormGroup } from '@angular/forms';

@Component({
  selector: 'reactive',
  templateUrl: './reactive.component.html',
  styleUrls: ['./reactive.component.css']
})
export class ReactiveComponent {

  //FormControl para cada propriedade
  nome : FormControl = new FormControl('')
  email: FormControl = new FormControl ('') 
  senha: FormControl = new FormControl ('') 

  //FormGroup serve para agrupar as propriedades FormControl
  dadosFormulario: FormGroup = new FormGroup({
    nomeUsuario:new FormControl(''),
    email: new FormControl(''),
    senha: new FormControl('')
    
  })
  
  enviar(){
    this.nome.value
    this.email.value
    this.senha.value
    /*A propriedade value  do formControl possui o valor que foi digitado dentro do campopelo usuario*/
  }
}
