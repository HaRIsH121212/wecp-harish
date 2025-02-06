
export class User {

<<<<<<< HEAD
    userId: number;
    fullName: string;
    username: string;
    password: string;
    email: string;
    role: string;

    constructor(
        userId: number,
        fullName: string,
        username: string,
        password: string,
        email: string,
        role: string
    ) {
        this.userId = userId;
        this.fullName = fullName;
        this.username = username;
        this.password = password;
        this.email = email;
        this.role = role;
    }

    displayInfo() {
        console.log(`User ID: ${this.userId}`);
        console.log(`Full Name: ${this.fullName}`);
        console.log(`Email: ${this.email}`);
    }
=======
>>>>>>> 1e477257c951fd34a277dae7c497465b61ae0a5b
}