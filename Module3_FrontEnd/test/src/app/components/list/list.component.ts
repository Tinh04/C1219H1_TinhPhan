import { Component, OnInit } from '@angular/core';
import {Student} from "../../model/student";
import {StudentService} from "../../service/student.service";

@Component({
  selector: 'app-list',
  templateUrl: './list.component.html',
  styleUrls: ['./list.component.css']
})
export class ListComponent implements OnInit {

  studentList: Student[] = [];

  constructor(private studentService: StudentService) {
  }

  ngOnInit() {
    this.studentService.getAll().subscribe(next => {
      this.studentList = next;
    }, error => {
      console.log(error);
    }, () => {
      console.log('complete');
    });
  }

  deleteStudent(i: number) {
    if (confirm('You want delete this student?')) {
      this.studentService.delete(i).subscribe(data => {
        window.location.reload();
      });
    }
  }

}
