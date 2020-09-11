import { Component, OnInit } from '@angular/core';
import {FormBuilder, FormGroup, Validators} from "@angular/forms";
import {CustomerService} from "../../../service/customer.service";
import {ActivatedRoute, Router} from "@angular/router";

@Component({
  selector: 'app-edit-customer',
  templateUrl: './edit-customer.component.html',
  styleUrls: ['./edit-customer.component.css']
})
export class EditCustomerComponent implements OnInit {

  customerForm: FormGroup;

  constructor(private customerService: CustomerService,
              private router: Router,
              private fb: FormBuilder,
              private activatedRoute: ActivatedRoute) {}

  ngOnInit(): void {
    this.customer();
  }

  private customer() {
    this.customerForm = this.fb.group({
      maKhachHang: ['', [Validators.required, Validators.pattern(/^KH-[0-9]{4}$/)]],
      tenKhachHang: ['', Validators.required],
      ngaySinh: ['', Validators.required],
      cmnd: ['', [Validators.required, Validators.pattern(/^([\d]{9}|[\d]{12})$/)]],
      diaChi: ['', Validators.required],
      email: ['', [Validators.required, Validators.email]],
      soDienThoai: ['', [Validators.required, Validators.pattern(/(090|091|\+(84)?91|\+(84)?90)+([0-9]{7})\b/)]]
    })

  }

  onSubmit() {
  }


}
