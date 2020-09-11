import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { NameCareComponent } from './name-care.component';

describe('NameCareComponent', () => {
  let component: NameCareComponent;
  let fixture: ComponentFixture<NameCareComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ NameCareComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(NameCareComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
