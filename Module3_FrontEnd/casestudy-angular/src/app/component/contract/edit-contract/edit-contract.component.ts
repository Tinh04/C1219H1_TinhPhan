import { Component, OnInit } from '@angular/core';
import {FormBuilder, FormGroup, Validators} from "@angular/forms";
import {ContractService} from "../../../service/contract.service";
import {ActivatedRoute, Router} from "@angular/router";
import {Contract} from "../../../model/contract";

@Component({
  selector: 'app-edit-contract',
  templateUrl: './edit-contract.component.html',
  styleUrls: ['./edit-contract.component.css']
})
export class EditContractComponent implements OnInit {

  editContractForm: FormGroup;
  contract: Contract;
  idContract;

  constructor(private contractService: ContractService,
              private router: Router,
              private fb: FormBuilder,
              private activatedRoute: ActivatedRoute) { }

  ngOnInit(): void {
    this.editContract();
    this.loadContract();
  }

  private editContract() {
    this.editContractForm = this.fb.group({
      maKhachHang: ['', [Validators.required, Validators.pattern(/^KH-[0-9]{4}$/)]],
      tenKhachHang: ['', Validators.required],
      id: ['', [Validators.required, Validators.pattern(/^HD-[0-9]{4}$/)]],
      ngayTao: ['', Validators.required],
      ngayKetThuc: ['', Validators.required],
      tienCoc: ['', Validators.required],
      tongTien: ['', Validators.required]
    })
  }

  private loadContract() {
    this.activatedRoute.params.subscribe(data => {
      this.idContract = data.id;
      this.contractService.getContractById(this.idContract).subscribe(data => {
        this.editContractForm.patchValue(data);
      });
      }
    );

  }

  onSubmit(): void {
    this.contractService.editContract(this.editContractForm.value, this.idContract).subscribe(data => {
      this.router.navigateByUrl('/contract');
    });
  }
}
