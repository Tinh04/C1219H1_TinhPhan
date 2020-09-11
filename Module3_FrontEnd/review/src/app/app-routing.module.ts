import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {ListStudentComponent} from "./component/list-student/list-student.component";
import {AppComponent} from "./app.component";
import {CreateStudentComponent} from "./component/create-student/create-student.component";
import {UpdateStudentComponent} from "./component/update-student/update-student.component";

const routes: Routes = [
  {path: '', component: AppComponent},
  {path: 'student-list', component: ListStudentComponent},
  {path: 'student-create', component: CreateStudentComponent},
  {path: 'student-update', component: UpdateStudentComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
