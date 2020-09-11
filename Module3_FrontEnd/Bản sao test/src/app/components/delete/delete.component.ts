import {Component, Inject, OnInit} from '@angular/core';
import {MAT_DIALOG_DATA, MatDialogRef} from "@angular/material/dialog";
import {StudentService} from "../../service/student.service";

@Component({
  selector: 'app-delete',
  templateUrl: './delete.component.html',
  styleUrls: ['./delete.component.css']
})
export class DeleteComponent implements OnInit {

  name_student;
  id_student;

  constructor(public dialogRef: MatDialogRef<DeleteComponent>,
              @Inject(MAT_DIALOG_DATA) public data: any,
              private studentService: StudentService) {}

  ngOnInit(): void {
    this.name_student = this.data.student.name;
    this.id_student = this.data.student.id;
  }

  goDelete() {
    this.studentService.delete(this.id_student).subscribe(data => {
      this.dialogRef.close();
    });
  }
}
