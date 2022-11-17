import { Component } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { IFormulario, IMunicipio, IUf } from 'src/app/model/dados';
import { IBGEService } from 'src/app/services/ibge.service';

@Component({
  selector: 'app-forms',
  templateUrl: './forms.component.html',
  styleUrls: ['./forms.component.css']
})
export class FormsComponent {

  constructor(
    private formBuilder: FormBuilder,
    private IBGEService: IBGEService,
  ) { }

  estados!: IUf[];
  cidades!: IMunicipio[];
  localVendas: IFormulario[] = [];

  formulario: FormGroup = this.formBuilder.group({
    nome: ["", [Validators.required]],
    local: ["", [Validators.required]],
    cidade: ["", [Validators.required]],
    estado:["", [Validators.required]],
    inicio: ["", [Validators.required]],
    termino: ["", [Validators.required]],
  })

  ngOnInit(): void{
    this.IBGEService.buscarUf().subscribe((ufRetornado) =>{
      this.estados = ufRetornado;
    });
  }

  procurarMunicipio(event: any) {
    const idDoMunicipio = event.target.value;
    this.IBGEService.buscarMunicipio(idDoMunicipio).subscribe((municipioRetornado) =>{
      this.cidades = municipioRetornado;
    })
  }
  
  adicionarLocalVenda(evento: any){
    evento.preventDefault();
    evento.stopPropagation();
    
    const nome = this.formulario.get("nome")?.value;
    const local = this.formulario.get("local")?.value;
    const cidade = this.formulario.get("cidade")?.value;
    const estado = this.formulario.get("estado")?.value;
    const inicio = this.formulario.get("inicio")?.value;
    const termino = this.formulario.get("termino")?.value;

    this.localVendas.push({
      nome: nome,
      estado: estado,
      cidade: cidade,
      local: local,
      horarioInicio: inicio,
      horarioTermino: termino
    })
  }

  validarLocalAdicionado(){
    
  }
}