import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'pipes';
  dataDeHoje: Date = new Date('Mon Oct 24 2022 16:28:38 GMT-0300')
   //dataDeHoje: Date = new Date()

   //itens = ['11258854469'];
}
