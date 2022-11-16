import { Component } from '@angular/core';
import {MatSnackBar} from '@angular/material/snack-bar';
import { bufferToggle } from 'rxjs';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent  {

  constructor(
    private snackbar : MatSnackBar
  ) {
    setTimeout(() => {
      this.objetoStyle['color'] = 'black';
    }, 
    5000)
  }

  public username : string = ""

  public img: any = {
    src: "https://cdn-icons-png.flaticon.com/512/17/17004.png",
    alt: "Foto Teste"
  }

  public clicar() : void{
      this.snackbar.open(`Bem-vindo(a) ${this.username}!`, "fechar", {
        duration: 5000,
        horizontalPosition: 'right',
        verticalPosition: "top"
      })
  }

  public mudarSapo: boolean = true;
  
  public mudarImg() : void { //MUDAR IMAGEM
    console.log(this.mudarSapo)
    this.mudarSapo = !this.mudarSapo
  }

  public objetoStyle : any = { //MUDAR A COR DO TEXTO
    'font-size': '20px',
    'color': 'blue'
  }

  public isError: Boolean = false; //SE NAO ESTIVER ERRO FICA VERDE


  public pipe: string = "Texto de Exemplo (pipe)" //PIPES

  public cpf: number = 11122233344

  public datePipe = new Date();
  
  public objPipe = {
    nome: "Gabriel Braga",
    idade: 20
  }
}

