import { Injectable } from '@angular/core';
import {Service, serviceList} from "../model/service";
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {Employee} from "../model/employee";

@Injectable({
  providedIn: 'root'
})
export class ServiceService {

  services = serviceList;
  private readonly SERVICE_URL = "http://localhost:3000/serviceList";

  constructor(private httpClient: HttpClient) {}

  findAll(): any {
    return this.services;
  }

  getAllService(): Observable<Service[]> {
    return this.httpClient.get<Service[]>(this.SERVICE_URL);
  }

  getServiceById(madichVu: string): Observable<Service> {
    return this.httpClient.get<Service>(`${this.SERVICE_URL}/${madichVu}`);
  }

  createService(service: Service): Observable<Service> {
    return this.httpClient.post<Service>(this.SERVICE_URL, service);
  }

  editService(service: Service): Observable<void> {
    return this.httpClient.patch<void>(`${this.SERVICE_URL}/${service.madichVu}`, service);
  }

  deleteService(madichVu: string): Observable<void> {
    return this.httpClient.delete<void>(`${this.SERVICE_URL}/${madichVu}`);
  }
}
