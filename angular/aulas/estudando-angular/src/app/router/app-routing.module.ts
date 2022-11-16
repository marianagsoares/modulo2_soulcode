import { Component, NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { CalcNotaComponent } from '../views/calc-nota/calc-nota.component';
import { FormsComponent } from '../views/forms/forms.component';
import { HomeComponent } from '../views/home/home.component';

const routes: Routes = [{
  path: "",
  component : HomeComponent
},
{
  path: "forms",
  component : FormsComponent
},
{
  path: "calcNota",
  component :  CalcNotaComponent
}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
//TAMBÉM E UM MODULO QUE FAZ UMA SERIE DE CONFIGURACOES DE ROTAS