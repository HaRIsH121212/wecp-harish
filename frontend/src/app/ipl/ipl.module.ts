import { NgModule } from "@angular/core";
import { CommonModule } from "@angular/common";

import { IplRoutingModule } from "./ipl-routing.module";
import { ReactiveFormsModule } from "@angular/forms";
import { HttpClientModule } from "@angular/common/http";
<<<<<<< HEAD
import { TeamCreateComponent } from "./components/teamcreate/teamcreate.component";
import { CricketerCreateComponent } from "./components/cricketercreate/cricketercreate.component";
import { MatchCreateComponent } from "./components/matchcreate/matchcreate.component";
import { TicketBookingComponent } from "./components/ticketbooking/ticketbooking.component";
import { VoteComponent } from "./components/vote/vote.component";
import { RouterModule } from "@angular/router";
import { SharedModule } from "../shared/shared.module";
import { DashboardComponent } from "./components/dashboard/dashboard.component";
import { CricketerEditComponent } from "./components/cricketeredit/cricketeredit.component";
import { TeamEditComponent } from "./components/teamedit/teamedit.component";
import { MatchEditComponent } from "./components/matchedit/matchedit.component";

@NgModule({
  declarations: [
    TeamCreateComponent,
    CricketerCreateComponent,
    MatchCreateComponent,
    TicketBookingComponent,
    VoteComponent,
    DashboardComponent,
    CricketerEditComponent,
    TeamEditComponent,
    MatchEditComponent
  ],
=======

@NgModule({
  declarations: [],
>>>>>>> 1e477257c951fd34a277dae7c497465b61ae0a5b
  imports: [
    CommonModule,
    ReactiveFormsModule,
    HttpClientModule,
<<<<<<< HEAD
    IplRoutingModule,
    RouterModule,
    SharedModule
=======
>>>>>>> 1e477257c951fd34a277dae7c497465b61ae0a5b
  ],
  exports: [
    
  ]
})
export class IplModule {}
