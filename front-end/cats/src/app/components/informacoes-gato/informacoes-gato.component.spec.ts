import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { InformacoesGatoComponent } from './informacoes-gato.component';

describe('InformacoesGatoComponent', () => {
  let component: InformacoesGatoComponent;
  let fixture: ComponentFixture<InformacoesGatoComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ InformacoesGatoComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(InformacoesGatoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
