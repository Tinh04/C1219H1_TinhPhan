import { Component, OnInit } from '@angular/core';
import {FormBuilder, FormGroup, Validators} from "@angular/forms";
import {StudentService} from "../../service/student.service";
import {Router} from "@angular/router";

@Component({
  selector: 'app-create',
  templateUrl: './create.component.html',
  styleUrls: ['./create.component.css']
})
export class CreateComponent implements OnInit {

  createForm: FormGroup;
  maxDate = new Date();
  minDate = new Date(1900, 0, 1);
  startDate = new Date();

  constructor(private studentService: StudentService,
              private router: Router,
              private formBuilder: FormBuilder) { }

  ngOnInit(): void {
    this.validateCreateForm();
  }

  validateCreateForm() {
    this.createForm = this.formBuilder.group({
      name: ['', Validators.required],
      birthday: ['', Validators.required],
      email: ['', [Validators.required, Validators.pattern('^([a-zA-Z0-9]\\_?\\.?)+\\@([a-zA-Z0-9]\\-?)+(\\.([a-z0-9])+)+$')]],
      phone: ['', [Validators.required, Validators.pattern('^(090)|d{7}$')]],
      class: ['', Validators.required]
    })
  }

  onSubmit() {
    if (this.createForm.valid) {
      this.studentService.create(this.createForm.value).subscribe(() => {
        this.router.navigateByUrl('list');
      })
    }
  }
}
