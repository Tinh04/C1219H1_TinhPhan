import { Component, OnInit } from '@angular/core';
import {FormBuilder, FormGroup, Validators} from "@angular/forms";
import {EmployeeService} from "../../../service/employee.service";
import {Router} from "@angular/router";

@Component({
  selector: 'app-edit-employee',
  templateUrl: './edit-employee.component.html',
  styleUrls: ['./edit-employee.component.css']
})
export class EditEmployeeComponent implements OnInit {

  employeeForm: FormGroup;

  constructor(private employeeService: EmployeeService,
              private route: Router,
              private fb: FormBuilder) { }

  ngOnInit(): void {
    this.employeeForm = this.fb.group({
      tenNhanVien: ['', Validators.required],
      ngaySinh: ['', Validators.required],
      soDienThoai: ['', [Validators.required, Validators.pattern(/(090|091|\+(84)?91|\+(84)?90)+([0-9]{7})\b/)]],
      cmnd: ['', [Validators.required, Validators.pattern(/^([\d]{9}|[\d]{12})$/)]],
      diaChi: ['', Validators.required],
      email: ['', [Validators.required, Validators.email]]
    })
  }

  onSubmit() {

  }

}
