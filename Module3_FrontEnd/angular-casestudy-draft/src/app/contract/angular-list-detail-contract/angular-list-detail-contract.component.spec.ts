import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AngularListDetailContractComponent } from './angular-list-detail-contract.component';

describe('AngularListDetailContractComponent', () => {
  let component: AngularListDetailContractComponent;
  let fixture: ComponentFixture<AngularListDetailContractComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AngularListDetailContractComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AngularListDetailContractComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
