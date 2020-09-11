import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AngularEditEmployeeComponent } from './angular-edit-employee.component';

describe('AngularEditEmployeeComponent', () => {
  let component: AngularEditEmployeeComponent;
  let fixture: ComponentFixture<AngularEditEmployeeComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AngularEditEmployeeComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AngularEditEmployeeComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
