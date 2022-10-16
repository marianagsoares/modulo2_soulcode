import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-primeiros-passos',
  templateUrl: './primeiros-passos.component.html',
  styleUrls: ['./primeiros-passos.component.css']
})
export class PrimeirosPassosComponent {

  title = "Angular é muito bom!";
  n1: number =0
  n2: number =0
  tipoInput: string = "text"
  somar(x: number, y: number){
    return x + y
  }

mudarTipoInput (): void{
    if(this.tipoInput == 'password'){
      this.tipoInput = "text"
    }else{
      this.tipoInput = "password"
    }
  }
}
