import { Injectable } from '@angular/core';
import { AngularFireAuth } from '@angular/fire/compat/auth';
import { Observable, from,  EMPTY, pipe } from 'rxjs';
import{ GoogleAuthProvider } from 'firebase/auth';
import { IUser } from '../models/user';
import { catchError } from 'rxjs/operators';
import { NotificationService } from './notification.service';

@Injectable({
  providedIn: 'root'
})

export class AutenticarService {

  constructor(
    private firebaseAuth: AngularFireAuth,
    private notifications: NotificationService
    ) { }

  public authenticateByGoogle(): Observable<any>{
    const provider = new GoogleAuthProvider();
    const promisse = this.firebaseAuth.signInWithPopup(provider)
    return from(promisse).pipe(
      catchError(error => {
          alert("Ocorreu um erro")
          return EMPTY;
      })
    )
  }

  AuthenticateByEmailAndPassWord(user: IUser){
    const {email, senha} = user;
    const promise = this.firebaseAuth.signInWithEmailAndPassword(email, senha);
    return from(promise).pipe(
      catchError(error => {
        if(error.code == "auth/user-not-found"){
          this.notifications.showMessage("Usuário não encontrado")
        }
        else if(error.code == "auth/wrong-password"){
          this.notifications.showMessage("Senha incorreta")
        }else{
          this.notifications.showMessage("Ocorreu um erro")
        }
        return EMPTY;
    })
    )
  }
  createUserEmailAndPassword(user : IUser){
      const {email, senha} = user;
      const promise = this.firebaseAuth.createUserWithEmailAndPassword(email, senha);
      return from (promise)
  }

  logout(){
   const promise = this.firebaseAuth.signOut();
    return from (promise)
  }
}
