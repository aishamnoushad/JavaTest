import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { map } from 'rxjs/operators';
import { User } from '../user';
@Injectable({
  providedIn: 'root'
})
export class AuthService {

  // BASE_PATH: 'http://localhost:8080'
  USER_NAME_SESSION_ATTRIBUTE_NAME = 'authenticatedUser'

  public username: string | undefined;
  public password: string | undefined;
  public user!: User;
  constructor(private http: HttpClient) {

  }

  authenticationService(username: string, password: string) {
    const headers = new HttpHeaders({ Authorization: 'Basic ' + btoa(username + ':' + password), "Access-Control-Allow-Origin": "*"});
    return this.http.get<User>('http://localhost:8080/secure/rest/validateLogin',{headers}).pipe(
     map(
       userData => {
        sessionStorage.setItem('username',username);
        return userData;
       }
     )
    );
    // return this.http.get(`http://localhost:8080/secure/rest/auth/process`,
    //   { headers: { authorization: this.createBasicAuthToken(username, password) } }).pipe(map((res: any) => {
    //       this.username = username;
    //       this.password = password;
    //       this.registerSuccessfulLogin(username, password);
    //     }));
  }

  // createBasicAuthToken(username: string, password: string) {
  //   return 'Basic ' + window.btoa(username + ":" + password)
  // }

  // registerSuccessfulLogin(username: string, password: string) {
  //   sessionStorage.setItem(this.USER_NAME_SESSION_ATTRIBUTE_NAME, username)
  // }

  // logout() {
  //   sessionStorage.removeItem(this.USER_NAME_SESSION_ATTRIBUTE_NAME);
  //   this.username = undefined;
  //   this.password = undefined;
  // }

  // isUserLoggedIn() {
  //   let user = sessionStorage.getItem(this.USER_NAME_SESSION_ATTRIBUTE_NAME)
  //   if (user === null) return false
  //   return true
  // }

  // getLoggedInUserName() {
  //   let user = sessionStorage.getItem(this.USER_NAME_SESSION_ATTRIBUTE_NAME)
  //   if (user === null) return ''
  //   return user
  // }
  isUserLoggedIn() {
    let user = sessionStorage.getItem('username')
    console.log(!(user === null))
    return !(user === null)
  }
  logOut() {
    sessionStorage.removeItem('username')
  }
}
