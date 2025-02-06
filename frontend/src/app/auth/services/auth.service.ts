<<<<<<< HEAD
import { HttpClient, HttpHeaders } from "@angular/common/http";
import { Observable } from "rxjs";
import { User } from "../../ipl/types/User";
import { environment } from "src/environments/environment";
import { Injectable } from "@angular/core";

@Injectable({
  providedIn: "root",
})
export class AuthService {
   private loginUrl = `${environment.apiUrl}`;
  // private loginUrl = `http://localhost:8080`;


  httpOptions = {
    headers: new HttpHeaders({
      'Content-Type': 'application/json',
      'Access-Control-Allow-Origin': '*'
    })
  };
=======
import { Injectable } from "@angular/core";
import { HttpClient, HttpHeaders } from "@angular/common/http";
import { map, Observable } from "rxjs";
import { User } from "../../ipl/types/User";

export class AuthService {
>>>>>>> 1e477257c951fd34a277dae7c497465b61ae0a5b

  constructor(private http: HttpClient) {}

  login(user: Partial<User>): Observable<{ [key: string]: string }> {
<<<<<<< HEAD
    return this.http.post<{ token: string }>(
      `${this.loginUrl}/user/login`,
      user,
      this.httpOptions
    );
  }

  getToken() {
    return localStorage.getItem("token");
  }

  getRole() {
    return localStorage.getItem("role");
=======
    return new Observable();
  }

  getToken() : string {
    return '';
  }

  getRole() : string {
    return '';
>>>>>>> 1e477257c951fd34a277dae7c497465b61ae0a5b
  }

  getUsers(): Observable<User[]> {
    return new Observable();
  }

  createUser(user: User): Observable<User> {
<<<<<<< HEAD
    return this.http.post<User>(`${this.loginUrl}/user/register`, user);
=======
    return new Observable();
>>>>>>> 1e477257c951fd34a277dae7c497465b61ae0a5b
  }
}
