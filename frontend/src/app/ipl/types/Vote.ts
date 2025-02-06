<<<<<<< HEAD
import { Cricketer } from "./Cricketer";
import { Team } from "./Team";

export class Vote {

    voteId: number;
    email: string;
    category: string;
    cricketer: Cricketer;
    team: Team;

    constructor(
        voteId: number,
        email: string,
        category: string,
        cricketer: Cricketer,
        team: Team
    ) {
        this.voteId = voteId;
        this.email = email;
        this.category = category;
        this.cricketer = cricketer;
        this.team = team;
    }

    displayInfo() {
        console.log(`Vote ID: ${this.voteId}`);
        console.log(`Email: ${this.email}`);
    }
=======

export class Vote {

>>>>>>> 1e477257c951fd34a277dae7c497465b61ae0a5b
}