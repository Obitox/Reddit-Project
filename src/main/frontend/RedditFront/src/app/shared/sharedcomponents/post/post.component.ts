import {Component, OnDestroy, OnInit} from '@angular/core';
import {Post} from "../../post/post";
import {Subscription} from "rxjs/Subscription";
import {PostService} from "../../post/post.service";

@Component({
  selector: 'rd-post',
  templateUrl: './post.component.html',
  styleUrls: ['./post.component.css']
})
export class PostComponent implements OnInit, OnDestroy {

  private posts: Post[];
  private subscription: Subscription;

  constructor(private postService: PostService){}

  ngOnInit(): void {
    this.loadAllPosts();
  }

  loadAllPosts() : void {
    this.subscription = this.postService.getAllPosts().subscribe(
      postsFromServer => this.posts = postsFromServer
    );
  }

  ngOnDestroy(): void {
    this.subscription.unsubscribe();
  }

  upVoted(i: number){
    this.posts[i].vote++;
    console.log(this.posts[i].vote);
    this.subscription = this.postService.updateVote(this.posts[i], this.posts[i].id, this.posts[i].vote).subscribe(
      data => {
        this.posts[i] = data[i];
        console.log(this.posts[i]);
      }
    );
  }

}
