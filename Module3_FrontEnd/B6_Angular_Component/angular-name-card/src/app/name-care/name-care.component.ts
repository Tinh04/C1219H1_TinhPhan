import {Component, Input, OnInit} from '@angular/core';

@Component({
  selector: 'app-name-care',
  templateUrl: './name-care.component.html',
  styleUrls: ['./name-care.component.css']
})
export class NameCareComponent implements OnInit {

  @Input() cardName: string;
  @Input() email: string;
  @Input() phone: string;

  constructor() { }

  ngOnInit(): void {
  }

}
