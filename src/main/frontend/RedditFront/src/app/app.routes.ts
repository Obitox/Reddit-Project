import {Routes, RouterModule, provideRoutes} from '@angular/router';

import {NewComponent} from "./components/new/new.component";
import {PopularComponent} from "./components/popular/popular.component";

const APP_ROUTES: Routes = [
  {
    path: '',
    component: PopularComponent
  },
  {
    path: 'new',
    component: NewComponent
  },
];

export const APP_ROUTES_PROVIDER = [
  provideRoutes(APP_ROUTES)
];

export const routing = RouterModule.forRoot(APP_ROUTES);
