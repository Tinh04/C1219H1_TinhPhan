import { Component, OnInit } from '@angular/core';
import {FormBuilder, FormControl, FormGroup, Validators} from "@angular/forms";
import {CustomerService} from "../../../service/customer.service";
import {Router} from "@angular/router";

@Component({
  selector: 'app-create-customer',
  templateUrl: './create-customer.component.html',
  styleUrls: ['./create-customer.component.css']
})
export class CreateCustomerComponent implements OnInit {

  customerForm: FormGroup;

  constructor(private customerService: CustomerService,
              private router: Router,
              private fb: FormBuilder) {

  }

  ngOnInit(): void {
    this.createCustomer();
  }

  private createCustomer() {
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
    if (this.customerForm.valid) {
      // this.customerService.crea
    }
  //this.customerService.createCustomer(this.customerForm.value).subscribe(data => {
    //         this.router.navigateByUrl('/customer');
  }
}
