import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-calculate',
  templateUrl: './calculate.component.html',
  styleUrls: ['./calculate.component.css']
})
export class CalculateComponent implements OnInit {

  first: number;
  second: number;
  result: number;
  notice: String;
  operator = '+';

  onFirstChange(value) {
    this.first = Number(value);
  }

  onSecondChange(value) {
    this.second = Number(value);
  }

  onSelectChange(value) {
    this.operator = value;
  }

  constructor() { }

  ngOnInit(): void {
  }

  calculate() {
    switch (this.operator) {
      case '+':
        this.result = this.first + this.second;
        break;
      case '-':
        this.result = this.first - this.second;
        break;
      case '*':
        this.result = this.first * this.second;
        break;
      case '/':
        if (this.second != 0) {
          this.result = this.first / this.second;
        } else {
          this.notice = "phep toan khong chia duoc"
        }
        break;
    }
  }

}
