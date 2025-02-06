<<<<<<< HEAD
import { Component } from "@angular/core";
import { Team } from "../../types/Team";

@Component({
    selector: 'app-teamsample',
    standalone: true,
    imports: [],
    templateUrl: './teamsample.component.html',
    styleUrls: ['./teamsample.component.scss'] 
  })
export class TeamSampleComponent  {
    team: Team = new Team(1, "CSK", "Chennai", "Dhoni", 2015);
=======

export class TeamSampleComponent  {

  
>>>>>>> 1e477257c951fd34a277dae7c497465b61ae0a5b
}
