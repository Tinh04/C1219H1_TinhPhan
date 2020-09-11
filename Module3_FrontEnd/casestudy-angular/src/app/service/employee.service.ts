import { Injectable } from '@angular/core';
import {Employee, employeeList} from "../model/employee";
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {Contract} from "../model/contract";

@Injectable({
  providedIn: 'root'
})
export class EmployeeService {

  employees = employeeList;
  private readonly EMPLOYEE_URL = "http://localhost:3000/employeeList";

  constructor(private httpClient: HttpClient) { }

  findAll(): any {
    return this.employees;
  }

  getAllEmployee(): Observable<Employee[]> {
    return this.httpClient.get<Employee[]>(this.EMPLOYEE_URL);
  }

  getEmployeeById(maNhanVien: string): Observable<Employee> {
    return this.httpClient.get<Employee>(`${this.EMPLOYEE_URL}/${maNhanVien}`);
  }

  createEmployee(employee: Employee): Observable<Employee> {
    return this.httpClient.post<Employee>(this.EMPLOYEE_URL, employee);
  }

  editEmployee(employee: Employee): Observable<void> {
    return this.httpClient.patch<void>(`${this.EMPLOYEE_URL}/${employee.maNhanVien}`, employee);
  }

  deleteEmployee(maHopDong: string): Observable<void> {
    return this.httpClient.delete<void>(`${this.EMPLOYEE_URL}/${maHopDong}`);
  }
}
