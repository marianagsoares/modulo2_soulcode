import { Injectable } from '@angular/core';
import { AngularFireAuth } from '@angular/fire/compat/auth';
import { MatSnackBar } from '@angular/material/snack-bar';
import { ActivatedRouteSnapshot, CanActivate, Router, RouterStateSnapshot, UrlTree } from '@angular/router';
import { map, Observable } from 'rxjs';
import { NotificationService } from './services/notification.service';

@Injectable({
  providedIn: 'root'
})
export class GuardsGuard implements CanActivate {
    constructor(
      private fireBaseAuth: AngularFireAuth,
      private router: Router,
      private snackBar: MatSnackBar,
      private notification: NotificationService
      ){}

  canActivate(
    route: ActivatedRouteSnapshot,
    state: RouterStateSnapshot): Observable<boolean | UrlTree> | Promise<boolean | UrlTree> | boolean | UrlTree {
    return this.fireBaseAuth.authState  /**authState diz qual o estado daquela aplicação**/ /*authstate retorna um observable com informacoes do usuario e por isso eu faço um tratamento de converção então, eu utilizo o map para retornar true ou false**/
    .pipe(
      map(user => {
        if(user){
          return true;
        }
        else{
          this.router.navigate(["/login"])
          this.notification.showMessage("Acesso negado. Faça login!")
          return false;
        }
      }) /*map pq nao quero retornar um usuario quero retornar um true ou false*/
    )
  }
  
}
