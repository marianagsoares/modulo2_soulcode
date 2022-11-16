import { NgModule } from '@angular/core';
import { MatSnackBarModule } from '@angular/material/snack-bar';
import {MatToolbarModule} from '@angular/material/toolbar';
import {MatButtonModule} from '@angular/material/button';
import {MatIconModule} from '@angular/material/icon';
import {MatCardModule} from '@angular/material/card';
import {MatMenuModule} from '@angular/material/menu';
import { HttpClientModule } from '@angular/common/http';


@NgModule({
  exports: [
    MatSnackBarModule,
    MatToolbarModule, 
    MatButtonModule,
    MatIconModule,
    MatCardModule,
    MatMenuModule,
    HttpClientModule
  ]
})
export class MaterialModule { }
