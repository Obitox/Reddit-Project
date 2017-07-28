import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { HttpModule } from '@angular/http';

import { AppComponent } from './app.component';
import {UserService} from "./user/user.service";
import { LogInComponent } from './log-in/log-in.component';
import {routing} from "./app.routes";
import { RedditPageComponent } from './reddit-page/reddit-page.component';

@NgModule({
  declarations: [
    AppComponent,
    LogInComponent,
    RedditPageComponent,
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpModule,
    routing
  ],
  providers: [UserService],
  bootstrap: [AppComponent]
})
export class AppModule { }
