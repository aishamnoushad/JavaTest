import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { AuthService } from '../login/auth.service';
import { User } from '../user';

@Component({
  selector: 'app-login-form',
  templateUrl: './login-form.component.html',
  styleUrls: ['./login-form.component.css']
})
export class LoginFormComponent implements OnInit {
  user : User = new User();
  errorMessage = 'Invalid Credentials';
  successMessage="";
  invalidLogin = false;
  loginSuccess = false;

  constructor(
    private route: ActivatedRoute,
    private router: Router,
    private authenticationService: AuthService) {   }

  ngOnInit() {
  }

  handleLogin() {

    (this.authenticationService.authenticationService(this.user.username, this.user.password).subscribe(
      data => {
        this.router.navigate(['adminPage'])
        this.invalidLogin = false
      },
      error => {
        this.invalidLogin = true
      }
    )
    );
    // this.authenticationService.authenticationService(this.user.username, this.user.password).subscribe((result)=> {
    //   this.invalidLogin = false;
    //   this.loginSuccess = true;
    //   this.successMessage = 'Login Successful.';
    //   this.router.navigate(['adminPage']);
    // }, () => {
    //   this.invalidLogin = true;
    //   this.loginSuccess = false;
    // });      
  }
  onSubmit(){
    console.log(this.user);
  }
}
  

