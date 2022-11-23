import { Injectable } from '@angular/core';
import { AngularFirestore } from '@angular/fire/compat/firestore';
import { Collaborator } from '../models/collaborator';
import { from, Observable, EMPTY } from 'rxjs';
import { NotificationService } from './notification.service';
import { catchError, map } from 'rxjs/operators';


@Injectable({
  providedIn: 'root'
})
export class CollaboratorService {

  constructor(
    private firestore: AngularFirestore,
    private notification: NotificationService
  ) { }

  public createCollaborator(collaborator: Collaborator): Observable<any> {
    const promise = this.firestore.collection("collaborators").add(collaborator);
    return from(promise).pipe(
      catchError(error => {
        this.notification.showMessage("Erro ao cadastrar")
        return EMPTY
      })
    )
  }

  public findAll(): Observable<any> {
   const promise = this.firestore.collection("collaborators").get()
    return from(promise).pipe(
          map((response: any) =>{
        return response.docs.map((doc: any) =>{
            const collaborator: Collaborator = doc.data() as Collaborator
            return collaborator
        })
      })
    )
  }
}
//transformar o formato que ta vindo no formato que a gente quer que é o formato de colaborador, coloco esses dados tranformados dentro de uma variável e retorno