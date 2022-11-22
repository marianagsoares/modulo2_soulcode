import { Component, NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { CadastrarUserComponent } from '../views/cadastrar-user/cadastrar-user.component';
import { HomeComponent } from '../views/home/home.component';
import { LoginComponent } from '../views/login/login.component';


const routes: Routes = [{
  path: "",
  pathMatch: "full",
  redirectTo: "home"
},
{
  path: "home",
  component: HomeComponent
},
{
  path: "login",
  component: LoginComponent
},
{
  path: "cadastrar",
  component: CadastrarUserComponent
}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
