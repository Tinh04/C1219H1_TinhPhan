import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AngularListEmployeeComponent } from './angular-list-employee.component';

describe('AngularListEmployeeComponent', () => {
  let component: AngularListEmployeeComponent;
  let fixture: ComponentFixture<AngularListEmployeeComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AngularListEmployeeComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AngularListEmployeeComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
