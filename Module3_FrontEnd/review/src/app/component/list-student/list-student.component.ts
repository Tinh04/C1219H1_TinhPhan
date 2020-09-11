import { Component, OnInit } from '@angular/core';
import {Student} from "../../model/student";
import {StudentService} from "../../service/student.service";

@Component({
  selector: 'app-list-student',
  templateUrl: './list-student.component.html',
  styleUrls: ['./list-student.component.css']
})
export class ListStudentComponent implements OnInit {

  students: Student[];
  key;

  constructor(private studentService: StudentService) { }

  ngOnInit(): void {
    this.displayStudent();
  }

  displayStudent() {
    this.studentService.getAllStudent().subscribe(data => {
      this.students = data;
    });
  }

  deleteStudent(student: Student): void {
    if (confirm("Do you want delete this student?")) {
      this.studentService.deleteStudent(student.id)
        .subscribe( data => {
          this.students = this.students.filter(s => s !== student);
        })
    }
  };
}
