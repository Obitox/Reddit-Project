import { Component, OnDestroy } from '@angular/core';
import {Subscription} from "rxjs/Subscription";

import {User} from "../../user/user";
import {UserService} from "../../user/user.service";

@Component({
  selector: 'rd-log-in',
  templateUrl: './log-in.component.html',
  styleUrls: ['./log-in.component.css']
})
export class LogInComponent implements OnDestroy{
  private subscription: Subscription;
  users: User[];
  private correctData: boolean = false;

  constructor(private userService: UserService){

  }

  onSubmit(value) : void {
    this.subscription = this.userService.authenticateUser(value.username, value.password).subscribe(
      dataFromServer => {
        if(dataFromServer){
          this.correctData = true;
        }
      }
    );


    //this.subscription = this.userService.getAllUsers().subscribe(
    //  dataFromServer => {
    //    this.users = dataFromServer;
//
    //    for(let item of this.users){
    //      if(item.username == value.username && item.password == value.password){
    //        return this.correctData = true;
    //      }
    //    }
    //  }
    //);

    /*<3* <-- this is from Marta */
  }

  ngOnDestroy(): void {
    this.subscription.unsubscribe();
  }
}
