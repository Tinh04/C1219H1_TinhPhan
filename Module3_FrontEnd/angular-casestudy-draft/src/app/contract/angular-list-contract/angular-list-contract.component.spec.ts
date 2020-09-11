import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AngularListContractComponent } from './angular-list-contract.component';

describe('AngularListContractComponent', () => {
  let component: AngularListContractComponent;
  let fixture: ComponentFixture<AngularListContractComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AngularListContractComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AngularListContractComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
