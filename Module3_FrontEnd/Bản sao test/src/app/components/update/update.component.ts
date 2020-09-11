import { Component, OnInit } from '@angular/core';
import {FormBuilder, FormGroup, Validators} from "@angular/forms";
import {StudentService} from "../../service/student.service";
import {ActivatedRoute, Router} from "@angular/router";
import {Student} from "../../model/student";

@Component({
  selector: 'app-update',
  templateUrl: './update.component.html',
  styleUrls: ['./update.component.css']
})
export class UpdateComponent implements OnInit {

  updateForm: FormGroup;
  maxDate = new Date();
  minDate = new Date(1900, 0, 1);
  startDate = new Date();
  studentID;
  student: Student;

  constructor(private studentService: StudentService,
              private router: Router,
              private formBuilder: FormBuilder,
              private activatedRoute: ActivatedRoute) { }

  ngOnInit(): void {
    this.getData();
    this.validateUpdateForm();
  }

  getData() {
    // this.activatedRoute.params.subscribe(data => {
    //   this.studentID = data.id;
    //   this.studentService.getById(this.studentID).subscribe(data => {
    //     this.updateForm.patchValue(data);
    //   })
    // })
    const id = + this.activatedRoute.snapshot.paramMap.get('id');
    this.studentService.getById(id).subscribe(
      next => {
        this.student = next;
        this.updateForm.patchValue(this.student);
      },
      error => {
        console.log(error);
        this.student = null;
      }
    );
  }

  validateUpdateForm() {
    this.updateForm = this.formBuilder.group({
      name: ['', Validators.required],
      birthday: ['', Validators.required],
      email: ['', [Validators.required, Validators.pattern('^([a-zA-Z0-9]\\_?\\.?)+\\@([a-zA-Z0-9]\\-?)+(\\.([a-z0-9])+)+$')]],
      phone: ['', [Validators.required, Validators.pattern('^(090)|d{7}$')]],
      class: ['', Validators.required]
    })
  }

  onSubmit() {
    // if (this.updateForm.valid) {
    //   this.studentService.create(this.updateForm.value).subscribe(() => {
    //     this.router.navigateByUrl('list');
    //   })
    // }
    if (this.updateForm.valid) {
      const { value } = this.updateForm;
      const data = {
        ...this.student,
        ...value
      };
      this.studentService.update(data).subscribe(
        next => {
          this.router.navigate(['/list']);
        },
        error => console.log(error)
      );
    }
  }
}
