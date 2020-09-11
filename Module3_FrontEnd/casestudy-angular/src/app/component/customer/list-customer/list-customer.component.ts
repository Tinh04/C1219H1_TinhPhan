import { Component, OnInit } from '@angular/core';
import {Router} from "@angular/router";
import {Customer} from "../../../model/customer";
import {CustomerService} from "../../../service/customer.service";

@Component({
  selector: 'app-list-customer',
  templateUrl: './list-customer.component.html',
  styleUrls: ['./list-customer.component.css']
})
export class ListCustomerComponent implements OnInit {

  customerList: Customer[];

  constructor(private customerService: CustomerService,
              private router: Router) {
  }

  ngOnInit(): void {
    this.customerList = this.customerService.findAll();
  }

  // deleteCustomer(maKhachHang: number): void {
  //   if (confirm('Bạn Có Muốn Xoá Khách Hàng Này?')) {
  //     const customer = this.customerList[maKhachHang];
  //     this.customerService.deleteCustomer(maKhachHang)
  //       .subscribe( () => {
  //         this.customerList = this.customerList.filter(c => c.maKhachHang !== customer.maKhachHang);
  //       });
  //     this.ngOnInit();
  //   }
  // }
}
