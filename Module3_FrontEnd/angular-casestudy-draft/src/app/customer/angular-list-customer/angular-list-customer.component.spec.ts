import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AngularListCustomerComponent } from './angular-list-customer.component';

describe('AngularListCustomerComponent', () => {
  let component: AngularListCustomerComponent;
  let fixture: ComponentFixture<AngularListCustomerComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AngularListCustomerComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AngularListCustomerComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
