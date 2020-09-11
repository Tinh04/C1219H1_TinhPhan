import { Component, OnInit } from '@angular/core';
import {Router} from "@angular/router";
import {Contract} from "../../../model/contract";
import {ContractService} from "../../../service/contract.service";

@Component({
  selector: 'app-list-contract',
  templateUrl: './list-contract.component.html',
  styleUrls: ['./list-contract.component.css']
})
export class ListContractComponent implements OnInit {

  contracts: Contract[];
  page = 1;

  constructor(private contractService: ContractService,
              private router: Router) { }

  ngOnInit(): void {
    // hien thi danh sach
    this.getContract();
  }

  private getContract() {
    this.contractService.getAllContract().subscribe(data => {
      this.contracts = data;
    });
  }

  deleteContract(contract: Contract) {
    if (confirm("Bạn Có Muốn Xoá Hợp Đồng Này?")) {
      this.contractService.deleteContract(contract.id).subscribe(data => {
        this.contracts = this.contracts.filter(ctr => ctr !== contract)
        // window.location.reload();
      });
    }
  }


}
