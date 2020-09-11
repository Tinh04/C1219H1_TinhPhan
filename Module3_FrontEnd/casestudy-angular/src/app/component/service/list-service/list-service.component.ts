import { Component, OnInit } from '@angular/core';
import {Service} from "../../../model/service";
import {ServiceService} from "../../../service/service.service";
import {Router} from "@angular/router";

@Component({
  selector: 'app-list-service',
  templateUrl: './list-service.component.html',
  styleUrls: ['./list-service.component.css']
})
export class ListServiceComponent implements OnInit {

  serviceList: Service[];

  constructor(private serviceService: ServiceService,
              private router: Router) { }

  ngOnInit(): void {
    this.serviceList = this.serviceService.findAll();
  }

}
