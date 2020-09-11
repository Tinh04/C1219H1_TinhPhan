import { Component, OnInit } from '@angular/core';
import {Student} from "../../model/student";
import {StudentService} from "../../service/student.service";
import {MatDialog} from "@angular/material/dialog";
import {DeleteComponent} from "../delete/delete.component";

@Component({
  selector: 'app-list',
  templateUrl: './list.component.html',
  styleUrls: ['./list.component.css']
})
export class ListComponent implements OnInit {

  students: Student[];
  key;
  page: Number = 1;

  constructor(private studentService: StudentService,
              public dialog: MatDialog) { }

  ngOnInit(): void {
    this.displayList();
  }

  displayList() {
    this.studentService.getAll().subscribe(data => {
      this.students = data;
    });
  }

  // onDelete(student: Student): void {
  //   if (confirm("Do you want delete '" + student.name + "' student?")) {
  //     this.studentService.delete(student.id)
  //       .subscribe( data => {
  //         this.students = this.students.filter(s => s !== student);
  //       })
  //   }
  // };

  onDelete(id): void {
    this.studentService.getById(id).subscribe(getDataOfStudent => {
      const dialogRef = this.dialog.open(DeleteComponent, {
        width: '500px',
        data: {student: getDataOfStudent},
        disableClose: true
      });

      dialogRef.afterClosed().subscribe(result => {
        console.log('The dialog was closed');
        this.displayList();
      });
    });
  }


}
