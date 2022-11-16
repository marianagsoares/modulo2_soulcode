import { Component} from '@angular/core';
import { FormBuilder, FormGroup, FormsModule, ReactiveFormsModule, Validators } from '@angular/forms';

@Component({
  selector: 'app-forms',
  templateUrl: './forms.component.html',
  styleUrls: ['./forms.component.css']
})
export class FormsComponent {

  public formulario: FormGroup;
  public formularioFrutas : FormGroup;

  constructor(
    private formBuilder : FormBuilder
  ) { 
    this.formulario = formBuilder.group({
      nome: ["", [Validators.required, Validators.min(0)]],
      cor: [""],
      preco: [""]
    })

    this.formularioFrutas = formBuilder.group({
      nome: ["", [Validators.required], Validators.min(0)],
      cor: [""],
      preco: [""]
    })
  }

  public heroi: any ={
    nome: "",
    idade: NaN,
    poder: ""
  }

  cadastrarFrutas(): void {
    if(this.formularioFrutas.valid) {
      alert("Cadastrado!")
    }
    else {
      alert("Formulário inválido!")
    }
  }
}
