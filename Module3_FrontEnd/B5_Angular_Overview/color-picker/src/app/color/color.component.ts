import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-color',
  templateUrl: './color.component.html',
  styleUrls: ['./color.component.css']
})
export class ColorComponent implements OnInit {

  background = '#ff8000';

  constructor() { }

  ngOnInit(): void {
  }

  onChange(value) {
    this.background = value;
  }

}
