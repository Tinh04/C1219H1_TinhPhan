import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AngularEditCustomerComponent } from './angular-edit-customer.component';

describe('AngularEditCustomerComponent', () => {
  let component: AngularEditCustomerComponent;
  let fixture: ComponentFixture<AngularEditCustomerComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AngularEditCustomerComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AngularEditCustomerComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
