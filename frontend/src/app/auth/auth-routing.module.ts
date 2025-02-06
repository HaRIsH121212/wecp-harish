import { NgModule } from "@angular/core";
import { RouterModule, Routes } from "@angular/router";
<<<<<<< HEAD
import { LoginComponent } from "./components/login/login.component";
import { RegistrationComponent } from "./components/registration/registration.component";

const routes: Routes = [
  { path: "", component: LoginComponent },
  { path: "login", component: LoginComponent },
  { path: "register", component: RegistrationComponent },
];
=======

const routes: Routes = [];
>>>>>>> 1e477257c951fd34a277dae7c497465b61ae0a5b

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule],
})
export class AuthRoutingModule {}
