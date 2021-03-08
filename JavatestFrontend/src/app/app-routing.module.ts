import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AdminmainpageComponent } from './adminmainpage/adminmainpage.component';
import { LoginFormComponent } from './login-form/login-form.component';

const routes: Routes = [
  {path:'login' , component : LoginFormComponent},
  {path:'' ,redirectTo :'login', pathMatch:'full'},
  {path:'adminPage' , component : AdminmainpageComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
