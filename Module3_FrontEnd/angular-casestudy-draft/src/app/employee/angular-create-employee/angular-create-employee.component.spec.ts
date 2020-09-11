import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AngularCreateEmployeeComponent } from './angular-create-employee.component';

describe('AngularCreateEmployeeComponent', () => {
  let component: AngularCreateEmployeeComponent;
  let fixture: ComponentFixture<AngularCreateEmployeeComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AngularCreateEmployeeComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AngularCreateEmployeeComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
