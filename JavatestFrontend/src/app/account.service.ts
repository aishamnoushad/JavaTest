import { HttpClient ,HttpErrorResponse,HttpHeaders} from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable,throwError } from 'rxjs';
import { Account } from './account';
import { Searchdetail } from './searchdetail';
import { Statement } from './statement';

@Injectable({
  providedIn: 'root'
})
export class AccountService {
  statements: Statement[] = [];
  searchdetail!: Searchdetail; 
  private getAccountURL ="http://localhost:8080/rest/auth/process";

  constructor(private httpclient : HttpClient) {}

  getAccounts(): Observable<Account[]>{
    return this.httpclient.get<Account[]>(`${this.getAccountURL}`);
  }

  onSubmit():Observable<Statement[]>{
    return this.httpclient.get<Statement[]>(`${this.getAccountURL}`);
  }

  getStatements(searchdetail :Searchdetail) {
    return this.httpclient.post(`http://localhost:8080/rest/auth/getStatements`, searchdetail);
  }
}




