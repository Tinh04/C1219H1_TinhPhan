import { Injectable } from '@angular/core';
import {Customer, customerList} from "../model/customer";
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";

@Injectable({
  providedIn: 'root'
})
export class CustomerService {

  customers = customerList;
  private readonly CUSTOMER_URL = ' http://localhost:3000/customerList';

  constructor(private httpClient: HttpClient) {}

  findAll(): Customer[] {
    return this.customers;
  }

  getAllCustomer(): Observable<Customer[]> {
    return this.httpClient.get<Customer[]>(this.CUSTOMER_URL);
  }

  getCustomerById(maKhachHang: string): Observable<Customer> {
    return this.httpClient.get<Customer>(`${this.CUSTOMER_URL}/${maKhachHang}`);
  }

  createCustomer(customer: Customer): Observable<Customer> {
    return this.httpClient.post<Customer>(this.CUSTOMER_URL, customer);
  }

  editCustomer(customer: Customer): Observable<void> {
    // return this.httpClient.patch<void>(this.CUSTOMER_URL + '/' + customer.maKhachHang, customer);
    return this.httpClient.patch<void>(`${this.CUSTOMER_URL}/${customer.maKhachHang}`, customer);
  }

  deleteCustomer(maKhachHang: string): Observable<void> {
    return this.httpClient.delete<void>(`${this.CUSTOMER_URL}/${maKhachHang}`);
  }
}
