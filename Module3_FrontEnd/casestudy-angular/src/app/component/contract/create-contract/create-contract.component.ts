import { Component, OnInit } from '@angular/core';
import {FormBuilder, FormGroup, Validators} from "@angular/forms";
import {ContractService} from "../../../service/contract.service";
import {Router} from "@angular/router";
import {Customer} from "../../../model/customer";
import {CustomerService} from "../../../service/customer.service";

@Component({
  selector: 'app-create-contract',
  templateUrl: './create-contract.component.html',
  styleUrls: ['./create-contract.component.css']
})
export class CreateContractComponent implements OnInit {

  createContractForm: FormGroup;
  customer: Customer[] = [];

  constructor(private contractService: ContractService,
              private customerService: CustomerService,
              private router: Router,
              private fb: FormBuilder) { }

  ngOnInit(): void {
    this.getCustomer();
    this.createContract();
  }

  private getCustomer() {
    this.customerService.getAllCustomer().subscribe(data => {
      this.customer = data;
    });
  }

  private createContract() {
    this.createContractForm = this.fb.group({
      maHopDong: ['', [Validators.required, Validators.pattern(/[0,9]{4}/)]],
      ngayTao: ['', Validators.required],
      ngayKetThuc: ['', Validators.required],
      tienCoc: ['', Validators.required],
      tongTien: ['', Validators.required]
    })
  }

  goCreateContract(): void {
    if (this.createContractForm.valid) {
      this.contractService.createContract(this.createContractForm.value).subscribe(data => {
        this.router.navigateByUrl('/contract');
      });
    }
  }
}
