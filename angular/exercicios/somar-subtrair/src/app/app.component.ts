import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  contador: number =0;

  somar():void{
    this.contador++
  }

  subtrair():void{
    this.contador--
  }

  zerar():void{
    this.contador=0
  }
}
