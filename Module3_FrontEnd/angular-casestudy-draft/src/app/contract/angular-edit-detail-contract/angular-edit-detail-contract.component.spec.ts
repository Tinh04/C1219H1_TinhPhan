import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AngularEditDetailContractComponent } from './angular-edit-detail-contract.component';

describe('AngularEditDetailContractComponent', () => {
  let component: AngularEditDetailContractComponent;
  let fixture: ComponentFixture<AngularEditDetailContractComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AngularEditDetailContractComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AngularEditDetailContractComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
