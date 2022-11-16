import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { AppRoutingModule } from './router/app-routing.module';
import { AppComponent } from './app.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { HeaderComponent } from './components/header/header.component';
import { HomeComponent } from './views/home/home.component';
import { FormsModule } from '@angular/forms';
import { FooterComponent } from './components/footer/footer.component';
import { MaterialModule } from './material/material.module';
import { FormsComponent } from './views/forms/forms.component';
import { ReactiveFormsModule } from '@angular/forms';
import { CalcNotaComponent } from './views/calc-nota/calc-nota.component';
import { FilmsListComponent } from './views/films-list/films-list.component';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    HomeComponent,
    FooterComponent,
    FormsComponent,
    CalcNotaComponent,
    FilmsListComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule, //CRIADO QUANDO GERAMOS O PROJETO COM --routing
    BrowserAnimationsModule,
    MaterialModule, //IMPORTA TODOS OS COMPONENTES QUE ESTAO DENTRO DO MATERIAL.TS
    FormsModule,
    ReactiveFormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
//SAO CLASSES ACOMPANHADAS POR UM DECORATOR
//DECORATOR SAO PALAVRAS CHAVES PRECIDADAS POR @
//NO JAVA CHAMAMOS DE ANOTACOES
//APP.MODULE.TS É O MODULO PRINCIPAL