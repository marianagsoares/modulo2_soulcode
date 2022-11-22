import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormControl, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { User } from 'firebase/auth';
import { IUser } from 'src/app/models/user';
import { AutenticarService } from 'src/app/services/autenticar.service';
import { NotificationService } from 'src/app/services/notification.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent{

  public formLogin: FormGroup;

  constructor(
    private formBuilder: FormBuilder,
    private autenticarService : AutenticarService,
    private router: Router,
    private notifications: NotificationService
    ) {

      this.formLogin = this.formBuilder.group({
        email: ['', [ Validators.required ]],
        senha: ['', [ Validators.required ]]
      })
   }

  emailFormControl = new FormControl('', [Validators.required, Validators.email]);

  public signInGoogle(): void {
    this.autenticarService.authenticateByGoogle().subscribe(credentials => {
      this.notifications.showMessage(" Autenticação realizada! Bem vindo(a)!")
      this.router.navigate(["/home"])
    })
  }

  public signEmailAndPassword() : void {
    const user: IUser = this.formLogin.value;
    console.log(user)
    this.autenticarService.AuthenticateByEmailAndPassWord(user).subscribe(credentials => {
      this.notifications.showMessage("Bem vindo(a)!")
      this.router.navigate(["/home"])
    })
  }
}
