import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {ListComponent} from "./components/list/list.component";
import {UpdateComponent} from "./components/update/update.component";

const routes: Routes = [
  {path: '', component: ListComponent},
  {path: 'student/update/:id', component: UpdateComponent}

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
