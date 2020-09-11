import {Component, Input, OnInit} from '@angular/core';
import {employeeList} from "../../employee";

@Component({
  selector: 'app-angular-list-employee',
  templateUrl: './angular-list-employee.component.html',
  styleUrls: ['./angular-list-employee.component.css']
})
export class AngularListEmployeeComponent implements OnInit {

  @Input() employeeList = employeeList;

  constructor() { }

  ngOnInit(): void {
  }

}
