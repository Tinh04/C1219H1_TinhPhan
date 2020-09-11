import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ListStudentComponent } from './component/list-student/list-student.component';
import { UpdateStudentComponent } from './component/update-student/update-student.component';
import { DetailStudentComponent } from './component/detail-student/detail-student.component';
import { CreateStudentComponent } from './component/create-student/create-student.component';
import { HttpClientModule} from "@angular/common/http";
import {FormsModule, ReactiveFormsModule} from "@angular/forms";
import { DetailComponent } from './component/detail/detail.component';

@NgModule({
  declarations: [
    AppComponent,
    ListStudentComponent,
    UpdateStudentComponent,
    DetailStudentComponent,
    CreateStudentComponent,
    DetailComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule,
    ReactiveFormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
