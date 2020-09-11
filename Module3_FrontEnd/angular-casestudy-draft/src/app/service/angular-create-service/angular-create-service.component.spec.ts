import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AngularCreateServiceComponent } from './angular-create-service.component';

describe('AngularCreateServiceComponent', () => {
  let component: AngularCreateServiceComponent;
  let fixture: ComponentFixture<AngularCreateServiceComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AngularCreateServiceComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AngularCreateServiceComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
