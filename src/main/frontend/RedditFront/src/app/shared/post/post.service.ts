import { Injectable } from '@angular/core';

import {Headers, Http, RequestOptions, Response} from '@angular/http';
import { Observable } from "rxjs/Observable";
import {Post} from "./post";


@Injectable()
export class PostService {

  constructor(private http: Http) { }

  getAllPosts() : Observable<Post[]>{
    return this.http.get('/post/allPosts').map(
      ((res: Response) => res.json())
    );
  }

  updateVote(posts: Post, id, vote) : Observable<Post>{
    let headers = new Headers({ 'Content-Type': 'application/json' });
    let options = new RequestOptions({headers: headers});
    let body = JSON.stringify(posts);
    return this.http.post('/post/updatePosts/'+id+'/'+vote, body, options)
      .map((res: Response) => res.json());
  }

}
