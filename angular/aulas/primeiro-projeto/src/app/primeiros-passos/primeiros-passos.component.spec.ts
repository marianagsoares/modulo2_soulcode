import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PrimeirosPassosComponent } from './primeiros-passos.component';

describe('PrimeirosPassosComponent', () => {
  let component: PrimeirosPassosComponent;
  let fixture: ComponentFixture<PrimeirosPassosComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ PrimeirosPassosComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(PrimeirosPassosComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
