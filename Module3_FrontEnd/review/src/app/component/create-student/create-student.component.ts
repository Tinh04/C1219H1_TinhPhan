import { Component, OnInit } from '@angular/core';
import {FormBuilder, FormGroup, Validators} from "@angular/forms";
import {StudentService} from "../../service/student.service";
import {Router} from "@angular/router";

@Component({
  selector: 'app-create-student',
  templateUrl: './create-student.component.html',
  styleUrls: ['./create-student.component.css']
})
export class CreateStudentComponent implements OnInit {

  createStudentForm: FormGroup;
  maxDate = new Date();
  minDate = new Date(1900, 1, 1);
  startDate = new Date();

  constructor(private studentService: StudentService,
              private router: Router,
              private formBuilder: FormBuilder) { }

  ngOnInit(): void {
  }

  createStudent() {
    this.createStudentForm = this.formBuilder.group({
      name: ['', Validators.required],
      birthday: ['', Validators.required],
      email: ['', [Validators.required, Validators.pattern('^([a-zA-Z0-9]\\_?\\.?)+\\@([a-zA-Z0-9]\\-?)+(\\.([a-z0-9])+)+$')]],
      phone: ['', Validators.required, Validators.pattern('^((09)|d{7}$')]

    })
  }

  onSubmit() {
    this.studentService.createStudent(this.createStudentForm.value).subscribe(data => {
      this.router.navigateByUrl('students');
    });
  }

}

//json-server -w db.json
// npm i ng2-search-filter --save
// npm install ngx-pagination --save
// npm install --save hammerjs
// npm install --save @angular/material @angular/animations @angular/cdk
