import { Component, OnInit } from '@angular/core';
import {FormBuilder, FormGroup, Validators} from "@angular/forms";
import {ServiceService} from "../../../service/service.service";
import {Router} from "@angular/router";

@Component({
  selector: 'app-edit-service',
  templateUrl: './edit-service.component.html',
  styleUrls: ['./edit-service.component.css']
})
export class EditServiceComponent implements OnInit {

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
