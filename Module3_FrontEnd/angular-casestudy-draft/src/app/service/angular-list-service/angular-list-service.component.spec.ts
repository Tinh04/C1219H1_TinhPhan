import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AngularListServiceComponent } from './angular-list-service.component';

describe('AngularListServiceComponent', () => {
  let component: AngularListServiceComponent;
  let fixture: ComponentFixture<AngularListServiceComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AngularListServiceComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AngularListServiceComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
