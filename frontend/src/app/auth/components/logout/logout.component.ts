<<<<<<< HEAD
import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-logout',
  templateUrl: './logout.component.html',
  styleUrls: ['./logout.component.scss']
})
export class LogoutComponent implements OnInit {

  constructor(private router: Router) { }

  ngOnInit(): void {
  }

  logout(): void {
    localStorage.removeItem('token')
    this.router.navigate(["/auth"]);
  }
=======

export class LogoutComponent {

>>>>>>> 1e477257c951fd34a277dae7c497465b61ae0a5b

}
