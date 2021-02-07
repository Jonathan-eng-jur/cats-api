import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { InformacoesTemperamentoRacasComponent } from './informacoes-temperamento-racas.component';

describe('InformacoesTemperamentoRacasComponent', () => {
  let component: InformacoesTemperamentoRacasComponent;
  let fixture: ComponentFixture<InformacoesTemperamentoRacasComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ InformacoesTemperamentoRacasComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(InformacoesTemperamentoRacasComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
