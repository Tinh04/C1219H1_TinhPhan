import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AngularEditContractComponent } from './angular-edit-contract.component';

describe('AngularEditContractComponent', () => {
  let component: AngularEditContractComponent;
  let fixture: ComponentFixture<AngularEditContractComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AngularEditContractComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AngularEditContractComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
