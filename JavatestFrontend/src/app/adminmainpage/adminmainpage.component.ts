import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs';
import { Account } from '../account';
import { AccountService } from '../account.service';
import { Searchdetail } from '../searchdetail';
import { Statement } from '../statement';

@Component({
  selector: 'app-adminmainpage',
  templateUrl: './adminmainpage.component.html',
  styleUrls: ['./adminmainpage.component.css']
})
export class AdminmainpageComponent implements OnInit {
  accounts!: Account[];
  searchdetails: Searchdetail = new Searchdetail;
  statements: Statement[] = [];
  constructor(private accountService: AccountService) { }

  ngOnInit(): void {
    this.getAccountsData();
  }

  
  private getAccountsData() {  
     
    this.accountService.getAccounts().subscribe((data : Account[]) => {
       console.log(data);
      this.accounts = data
      
    });
  }

  
}
