import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AngularCreateContractComponent } from './angular-create-contract.component';

describe('AngularCreateContractComponent', () => {
  let component: AngularCreateContractComponent;
  let fixture: ComponentFixture<AngularCreateContractComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AngularCreateContractComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AngularCreateContractComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
