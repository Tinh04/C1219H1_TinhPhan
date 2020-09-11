import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {Student} from "../model/student";

@Injectable({
  providedIn: 'root'
})
export class StudentService {

  private readonly STUDENT_URL = "http://localhost:3000/studentList";

  constructor(private httpClient: HttpClient) { }

  getAllStudent(): Observable<Student[]> {
    return this.httpClient.get<Student[]>(this.STUDENT_URL);
  }

  getStudentById(id: number): Observable<Student> {
    return this.httpClient.get<Student>(`${this.STUDENT_URL}/${id}`);
  }

  createStudent(student: Student): Observable<Student> {
    return this.httpClient.post<Student>(this.STUDENT_URL, student);
  }

  updateStudent(student: Student, id: number): Observable<void> {
    return this.httpClient.patch<void>(`${this.STUDENT_URL}/${id}`, student);
  }

  deleteStudent(id: number): Observable<Student> {
    return this.httpClient.delete<Student>(`${this.STUDENT_URL}/${id}`);
  }
}
