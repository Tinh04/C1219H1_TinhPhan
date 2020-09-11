import {Component, Input, OnInit} from '@angular/core';
import {customerList} from "../../customer";

@Component({
  selector: 'app-angular-list-customer',
  templateUrl: './angular-list-customer.component.html',
  styleUrls: ['./angular-list-customer.component.css']
})
export class AngularListCustomerComponent implements OnInit {

  @Input() customerList = customerList;

  constructor() { }

  ngOnInit(): void {
  }

}
