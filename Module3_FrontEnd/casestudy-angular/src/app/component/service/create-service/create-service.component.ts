import { Component, OnInit } from '@angular/core';
import {FormBuilder, FormGroup, Validators} from "@angular/forms";
import {ServiceService} from "../../../service/service.service";
import {Router} from "@angular/router";

@Component({
  selector: 'app-create-service',
  templateUrl: './create-service.component.html',
  styleUrls: ['./create-service.component.css']
})
export class CreateServiceComponent implements OnInit {

  serviceForm: FormGroup

  constructor(private serviceService: ServiceService,
              private router: Router,
              private fb: FormBuilder) { }

  ngOnInit(): void {
    this.serviceForm = this.fb.group({
      maDichVu: ['', [Validators.required, Validators.pattern(/^DV-[0-9]{4}$/)]],
      tenDichVu: ['', Validators.required],
      dienTich: ['', Validators.required],
      soNguoi: ['', Validators.required],
      chiPhi: ['', Validators.required]
    })
  }

  onSubmit() {

  }

}
