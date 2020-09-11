import { Component, OnInit } from '@angular/core';
import {Employee} from "../../../model/employee";
import {EmployeeService} from "../../../service/employee.service";
import {Router} from "@angular/router";

@Component({
  selector: 'app-list-employee',
  templateUrl: './list-employee.component.html',
  styleUrls: ['./list-employee.component.css']
})
export class ListEmployeeComponent implements OnInit {

  employeeList: Employee[];

  constructor(private employeeService: EmployeeService,
              private router: Router) { }

  ngOnInit(): void {
    this.employeeList = this.employeeService.findAll();
  }

}
