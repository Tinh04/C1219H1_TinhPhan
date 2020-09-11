import {Component, Input, OnInit} from '@angular/core';
import {serviceList} from "../../service";

@Component({
  selector: 'app-angular-list-service',
  templateUrl: './angular-list-service.component.html',
  styleUrls: ['./angular-list-service.component.css']
})
export class AngularListServiceComponent implements OnInit {

  @Input() serviceList = serviceList;

  constructor() { }

  ngOnInit(): void {
  }

}
