import { NgModule } from "@angular/core";
import { CommonModule } from "@angular/common";

import { AuthRoutingModule } from "./auth-routing.module";
import { ReactiveFormsModule } from "@angular/forms";
import { HttpClientModule } from "@angular/common/http";
<<<<<<< HEAD
import { RegistrationComponent } from "./components/registration/registration.component";
import { LoginComponent } from "./components/login/login.component";
import { RouterModule } from "@angular/router";
import { LogoutComponent } from "./components/logout/logout.component";

@NgModule({
  declarations: [
    RegistrationComponent,
    LoginComponent,
    LogoutComponent
  ],
=======

@NgModule({
  declarations: [],
>>>>>>> 1e477257c951fd34a277dae7c497465b61ae0a5b
  imports: [
    CommonModule,
    AuthRoutingModule,
    ReactiveFormsModule,
    HttpClientModule,
<<<<<<< HEAD
    RouterModule
  ],
  exports: [
    LogoutComponent
=======
  ],
  exports: [
    
>>>>>>> 1e477257c951fd34a277dae7c497465b61ae0a5b
  ]
})
export class AuthModule {}
