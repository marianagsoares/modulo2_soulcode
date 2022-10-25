import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { LenghtArrayPipe } from './comprimento';
import { CpfPipe } from './cpf.pipe';

@NgModule({
  declarations: [
    AppComponent,
    LenghtArrayPipe,
    CpfPipe //PIPE PRECISA ESTAR DECLARADO
  ],
  imports: [
    BrowserModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
