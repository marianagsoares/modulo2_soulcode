import { Component, NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { GuardsGuard } from '../auth.guard';

import { CadastrarUserComponent } from '../views/cadastrar-user/cadastrar-user.component';
import { DashboardComponent } from '../views/dashboard/dashboard.component';

import { HomeComponent } from '../views/home/home.component';
import { LoginComponent } from '../views/login/login.component';
import { NewCollaboratorComponent } from '../views/new-collaborator/new-collaborator.component';


const routes: Routes = [{
  path: "",
  pathMatch: "full",
  redirectTo: "home"
},
{
  path: "home",
  component: HomeComponent,
  canActivate: [GuardsGuard],
  title: "Home | Collaborators"
},
{
  path: "login",
  component: LoginComponent,
  title: "Login | Collaborators"
},
{
  path: "cadastrar",
  component: CadastrarUserComponent,
  title: "Cadastrar | Collaborators"
},
{
  path: "dashboard",
  component: DashboardComponent,
  canActivate: [GuardsGuard],
  title: "Painel de controle| Collaborators"
},
{
  path: "dashboard/new",
  component: NewCollaboratorComponent,
  canActivate: [GuardsGuard],
  title: "Novo Colaborador | Collaborators"
}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
