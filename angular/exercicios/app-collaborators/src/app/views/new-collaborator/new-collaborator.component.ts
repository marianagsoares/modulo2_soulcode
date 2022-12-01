import { Router } from '@angular/router';
import { CollaboratorService } from './../../services/collaborator.service';
import { Collaborator } from './../../models/collaborator';
import { NotificationService } from './../../services/notification.service';
import { FormGroup, FormBuilder, Validators } from '@angular/forms';
import { Component, OnInit } from '@angular/core';
import { UploadService } from 'src/app/services/upload.service';

@Component({
  selector: 'app-new-collaborator',
  templateUrl: './new-collaborator.component.html',
  styleUrls: ['./new-collaborator.component.css']
})
export class NewCollaboratorComponent implements OnInit {

  public formCollaborator: FormGroup;

  constructor(
    fb: FormBuilder,
    private notification: NotificationService,
    private collaboratorService: CollaboratorService,
    private router: Router,
    private uploadService: UploadService
  ) {
    this.formCollaborator = fb.group({
      nome: ["", [Validators.required]],
      cpf: ["", [Validators.required]],
      dataNascimento: ["", [Validators.required]],
      cargo: ["", [Validators.required]],
      setor: ["", [Validators.required]],
      estado: ["", [Validators.required]],
      cidade: ["", [Validators.required]],
      remuneracao: ["", [Validators.required, Validators.min(0)]],
      email: ["", [Validators.required, Validators.email]],
    });
  }

  ngOnInit(): void {
  }

  public createCollaborator(): void {
    if(this.formCollaborator.valid) {
      const collaborator: Collaborator = this.formCollaborator.value;
      collaborator.fotoUrl = this.fotoUrl
      this.collaboratorService.createCollaborator(collaborator).subscribe(response => {
        this.notification.showMessage("Cadastrado com sucesso.");
        this.router.navigate(["/dashboard"]);
      });
    }
    else {
      this.notification.showMessage("Dados inválidos.");
    }
  }

  private fotoUrl: string = "" //(*)
  public isLoadUpload: boolean = false

  public uploadFile(event: any): void {
    this.isLoadUpload = true;
    const file: File = event.target.files[0];
    this.uploadService.uploadFoto(file).subscribe(uploadResult  => {
      this.isLoadUpload = false;
      const storageReference = uploadResult.ref;
      const promiseFileUrl = storageReference.getDownloadURL();
      promiseFileUrl.then((fotoUrlRetornada: string) => {
        this.fotoUrl = fotoUrlRetornada;
      })
    });
  }
}
//uploadResult é o resultado do upload e ele retorna um storageReference que possui um metodo getDownloadUrl que por sua vez retorna pra gente uma promise e toda promise possui um objeto do tipo then que tem um parâmetro do tipo string que é a foto e embaixo, a fotoUrl que iniciou vazia(*) será igualada a variavel que retorna a url da imagem.