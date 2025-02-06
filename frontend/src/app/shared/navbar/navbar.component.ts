<<<<<<< HEAD
import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-navbar',
  templateUrl: './navbar.component.html',
  styleUrls: ['./navbar.component.scss']
})
export class NavBarComponent implements OnInit {

  constructor(private router: Router) { }

  role:string|null;
  ngOnInit(): void {

    console.log(localStorage.getItem("role"));
    this.role=localStorage.getItem("role");
  }

  logout(): void {
    localStorage.removeItem('token')
    this.router.navigate(["/auth"]);
  }
=======

export class NavBarComponent{

  
>>>>>>> 1e477257c951fd34a277dae7c497465b61ae0a5b

}
