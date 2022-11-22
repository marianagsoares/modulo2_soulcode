import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { AutenticarService } from 'src/app/services/autenticar.service';
import { NotificationService } from 'src/app/services/notification.service';

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css']
})
export class HeaderComponent implements OnInit {

  constructor(
    private authService: AutenticarService,
    private router: Router,
    private notifications: NotificationService
    ) { }

  ngOnInit(): void {
  }
  
  public logout(): void{
    this.authService.logout().subscribe(response =>{
      this.notifications.showMessage("você foi deslogado")
      this.router.navigate(["/login"])
    })
  }
}
