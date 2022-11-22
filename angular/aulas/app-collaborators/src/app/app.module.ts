import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './routes/app-routing.module';
import { AppComponent } from './app.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import {AngularFireModule} from '@angular/fire/compat';
import { environment } from 'src/environments/environment';
import { LoginComponent } from './views/login/login.component';
import { CadastrarUserComponent } from './views/cadastrar-user/cadastrar-user.component';
import { HomeComponent } from './views/home/home.component';
import {  RouterModule } from '@angular/router';
import { AngularModule } from './material/angular/angular.module';
import { HeaderComponent } from './componentes/header/header.component';
import { DashboardComponent } from './views/dashboard/dashboard.component';
import { NewCollaboratorComponent } from './views/new-collaborator/new-collaborator.component';


@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    CadastrarUserComponent,
    HomeComponent,
    HeaderComponent,
    DashboardComponent,
    NewCollaboratorComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    AngularFireModule.initializeApp(environment.firebaseConfig), //INICIALIZA O FIREBASE
    AngularFireModule,
    RouterModule,
    AngularModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
