import { Injectable } from '@angular/core';
import {Headers,Http, RequestOptions, Response} from '@angular/http';
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

  authenticateUser(username: String, password: String) : Observable<any> {
    return this.http.get('/login/'+username+'/'+password).map((res: Response)=> res.json());
  }


}
