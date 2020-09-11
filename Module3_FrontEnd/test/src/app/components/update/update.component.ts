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

  student: Student;
  updateForm: FormGroup;

  constructor(
    private route: ActivatedRoute,
    private studentService: StudentService,
    private fb: FormBuilder,
    private router: Router) {}

  ngOnInit() {
    this.updateForm = this.fb.group({
      id: [''],
      ten_sinh_vien: ['', [Validators.required, Validators.pattern(/[^0-9/~?><.,@]$/)]],
      ten_nhom: ['', [Validators.required]],
      ten_de_tai: ['', [Validators.required]],
      giao_vien_huong_dan: ['', [Validators.required]],
      email: ['', [Validators.required, Validators.email]],
      so_dien_thoai: ['', [Validators.required, Validators.pattern(/^([\d]{10}|[\d]{12})$/)]]
    });
    const id = +this.route.snapshot.paramMap.get('id');
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
  onSubmit() {
    if (this.updateForm.valid) {
      const { value } = this.updateForm;
      const data = {
        ...this.student,
        ...value
      };
      this.studentService.update(data).subscribe(
        next => {
          this.router.navigate(['/']);
        },
        error => console.log(error)
      );
    }
  }
}
