import {Component, Input, OnInit} from '@angular/core';
import {contractList} from "../../contract";

@Component({
  selector: 'app-angular-list-contract',
  templateUrl: './angular-list-contract.component.html',
  styleUrls: ['./angular-list-contract.component.css']
})
export class AngularListContractComponent implements OnInit {

  @Input() contractList = contractList;

  constructor() { }

  ngOnInit(): void {
  }

}
