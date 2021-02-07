import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { InformacoesOrigemRacasComponent } from './informacoes-origem-racas.component';

describe('InformacoesOrigemRacasComponent', () => {
  let component: InformacoesOrigemRacasComponent;
  let fixture: ComponentFixture<InformacoesOrigemRacasComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ InformacoesOrigemRacasComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(InformacoesOrigemRacasComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
