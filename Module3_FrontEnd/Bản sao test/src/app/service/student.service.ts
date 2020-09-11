import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {Student} from "../model/student";

@Injectable({
  providedIn: 'root'
})
export class StudentService {

  private readonly API_URL = "http://localhost:3000/studentList";

  constructor(private httpClient: HttpClient) { }

  getAll(): Observable<Student[]> {
    return this.httpClient.get<Student[]>(this.API_URL);
  }

  getById(id: number): Observable<Student> {
    return this.httpClient.get<Student>(`${this.API_URL}/${id}`);
  }

  create(student: Student): Observable<Student> {
    return this.httpClient.post<Student>(this.API_URL, student);
  }

  update(student: Student): Observable<void> {
    return this.httpClient.patch<void>(`${this.API_URL}/${student.id}`, student);
  }

  delete(id: number): Observable<Student> {
    return this.httpClient.delete<Student>(`${this.API_URL}/${id}`);
  }
}
