import { Component } from '@angular/core';

@Component({
  selector: 'app-data-binding',
  templateUrl: './data-binding.component.html',
  styleUrls: ['./data-binding.component.css']
})
export class DataBindingComponent {

title = "Angular é muito bom!";
  n1: number =0
  n2: number =0
  tipoInput: string = "password"
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
