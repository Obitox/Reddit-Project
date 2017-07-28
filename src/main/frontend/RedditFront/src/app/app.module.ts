import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { HttpModule } from '@angular/http';

import { AppComponent } from './components/app/app.component';
import {UserService} from "./shared/user/user.service";
import { LogInComponent } from './shared/sharedcomponents/log-in/log-in.component';
import {routing} from "./app.routes";
import { NewComponent } from './components/new/new.component';
import { PopularComponent } from './components/popular/popular.component';
@NgModule({
  declarations: [
    AppComponent,
    LogInComponent,
    NewComponent,
    PopularComponent,
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
