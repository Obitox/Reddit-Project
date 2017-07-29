import { Injectable } from '@angular/core';
import { Http, Response } from '@angular/http';
import 'rxjs/add/operator/map';
import {User} from "./user";
import {Observable} from "rxjs/Observable";

@Injectable()
export class UserService {

  constructor (
    private http: Http
  ) {}

  getAllUsers() : Observable<User[]> {
    return this.http.get(`/user/allUsers`)
      .map((res:Response) => res.json());
  }
}
