import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormControl, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { IUser } from 'src/app/models/user';
import { AutenticarService } from 'src/app/services/autenticar.service';
import { NotificationService } from 'src/app/services/notification.service';

@Component({
  selector: 'app-cadastrar-user',
  templateUrl: './cadastrar-user.component.html',
  styleUrls: ['./cadastrar-user.component.css']
})
export class CadastrarUserComponent implements OnInit {


  public formCadastro: FormGroup;

  constructor(
    private formBuilder: FormBuilder,
    private autenticarService: AutenticarService,
    private router: Router,
    private notifications: NotificationService
    ) {

      this.formCadastro = formBuilder.group({
        email: ['', [ Validators.required ]],
        senha: ['', [ Validators.required ]]
      })
   }
   emailFormControl = new FormControl('', [Validators.required, Validators.email])

  ngOnInit(): void {
  }

  public signInGoogle(): void {
    this.autenticarService.authenticateByGoogle().subscribe(credentials => {
      this.notifications.showMessage("Bem vindo!")
    })
  }

  public createUserEmailAndPassword(): void {
    const user : IUser = this.formCadastro.value;
    this.autenticarService.createUserEmailAndPassword(user).subscribe(response => {
      alert ("usuario cadastrado")
       this.router.navigate(["/login"])
    })
  }
}
