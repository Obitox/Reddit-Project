import {Routes, RouterModule, provideRoutes} from '@angular/router';

import {AppComponent} from "./app.component";
import {LogInComponent} from "./log-in/log-in.component";
import {RedditPageComponent} from "./reddit-page/reddit-page.component";

const APP_ROUTES: Routes = [
  {
    path: 'log-in', component: LogInComponent
  },
  {
    path: 'reddit-page', component: RedditPageComponent
  },
  {
    path: '**', redirectTo: 'log-in', pathMatch: 'full'
  }
];

export const APP_ROUTES_PROVIDER = [
  provideRoutes(APP_ROUTES)
];

export const routing = RouterModule.forRoot(APP_ROUTES);
