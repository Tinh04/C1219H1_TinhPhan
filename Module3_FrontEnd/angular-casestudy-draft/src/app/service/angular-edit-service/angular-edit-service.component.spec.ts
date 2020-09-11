import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AngularEditServiceComponent } from './angular-edit-service.component';

describe('AngularEditServiceComponent', () => {
  let component: AngularEditServiceComponent;
  let fixture: ComponentFixture<AngularEditServiceComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AngularEditServiceComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AngularEditServiceComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
