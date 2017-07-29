import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { HttpModule } from '@angular/http';

//COMPONENTS
import { AppComponent } from './components/app/app.component';
import { LogInComponent } from './shared/sharedcomponents/log-in/log-in.component';
import { NewComponent } from './components/new/new.component';
import { PopularComponent } from './components/popular/popular.component';

//SERVICES
import {UserService} from "./shared/user/user.service";
import {PostService} from "./shared/post/post.service";

//ROUTING
import {routing} from "./app.routes";
import { PostComponent } from './shared/sharedcomponents/post/post.component';

@NgModule({
  declarations: [
    AppComponent,
    LogInComponent,
    NewComponent,
    PopularComponent,
    PostComponent,
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpModule,
    routing
  ],
  providers: [UserService, PostService],
  bootstrap: [AppComponent]
})
export class AppModule { }
