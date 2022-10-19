import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { CreditCardComponent } from './credit-card/credit-card.component';

@NgModule({
  declarations: [
    AppComponent,
    CreditCardComponent
  ],
  imports: [
    BrowserModule,
    FormsModule //SEMPRE QUE USAR DATA-BINDING PRECISO IMPORTAR FORMS MODULE
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
