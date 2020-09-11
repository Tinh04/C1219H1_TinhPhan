import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AngularListCustomerUseServiceComponent } from './angular-list-customer-use-service.component';

describe('AngularListCustomerUseServiceComponent', () => {
  let component: AngularListCustomerUseServiceComponent;
  let fixture: ComponentFixture<AngularListCustomerUseServiceComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AngularListCustomerUseServiceComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AngularListCustomerUseServiceComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
