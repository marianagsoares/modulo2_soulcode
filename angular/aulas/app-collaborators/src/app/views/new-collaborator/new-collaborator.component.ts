import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { Collaborator } from 'src/app/models/collaborator';
import { CollaboratorService } from 'src/app/services/collaborator.service';
import { NotificationService } from 'src/app/services/notification.service';

@Component({
  selector: 'app-new-collaborator',
  templateUrl: './new-collaborator.component.html',
  styleUrls: ['./new-collaborator.component.css']
})
export class NewCollaboratorComponent implements OnInit {

  public formCollaborator: FormGroup;

  constructor(
    private formBuilder: FormBuilder,
    private notification: NotificationService,
    private collaboratoService: CollaboratorService,
    private router: Router
    ) {

    this.formCollaborator = formBuilder.group({
      nome: ["", [Validators.required]],
      cpf: ["", [Validators.required]],
      dataNascimento: ["", [Validators.required]],
      cargo: ["", [Validators.required]],
      setor: ["", [Validators.required]],
      estado: ["", [Validators.required]],
      cidade: ["", [Validators.required]],
      remuneracao: ["", [Validators.required]],
      email: ["", [Validators.required]]
    })
  }

  ngOnInit(): void {
  }

  public createCollaborator() : void{
      if(this.formCollaborator.valid){
        const collaborator: Collaborator = this.formCollaborator.value
        this.collaboratoService.createCollaborator(collaborator).subscribe(response =>{
          this.notification.showMessage("Cadastrado com sucesso");
          this.router.navigate(["/dashboard"])
        })
      }else{
        this.notification.showMessage("Dados inválidos");
      }
  }

}
