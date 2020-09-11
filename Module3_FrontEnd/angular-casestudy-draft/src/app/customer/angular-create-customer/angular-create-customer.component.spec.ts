import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AngularCreateCustomerComponent } from './angular-create-customer.component';

describe('AngularCreateCustomerComponent', () => {
  let component: AngularCreateCustomerComponent;
  let fixture: ComponentFixture<AngularCreateCustomerComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AngularCreateCustomerComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AngularCreateCustomerComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
