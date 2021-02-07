import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpClientModule } from '@angular/common/http';
import { CommonModule } from '@angular/common';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './components/header/header.component';
import { PrincipalComponent } from './components/principal/principal.component';
import { InformacoesGatoComponent } from './components/informacoes-gato/informacoes-gato.component';
import { InformacoesTemperamentoRacasComponent } from './components/informacoes-temperamento-racas/informacoes-temperamento-racas.component';
import { InformacoesOrigemRacasComponent } from './components/informacoes-origem-racas/informacoes-origem-racas.component';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    PrincipalComponent,
    InformacoesGatoComponent,
    InformacoesTemperamentoRacasComponent,
    InformacoesOrigemRacasComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,    
    CommonModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
