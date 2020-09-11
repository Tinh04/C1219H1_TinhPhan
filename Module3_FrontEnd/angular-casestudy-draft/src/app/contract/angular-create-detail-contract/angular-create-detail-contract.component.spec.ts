import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AngularCreateDetailContractComponent } from './angular-create-detail-contract.component';

describe('AngularCreateDetailContractComponent', () => {
  let component: AngularCreateDetailContractComponent;
  let fixture: ComponentFixture<AngularCreateDetailContractComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AngularCreateDetailContractComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AngularCreateDetailContractComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
