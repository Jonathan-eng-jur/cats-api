import { Gato } from './../../models/gato.model';
import { GatoService } from './../../services/gatos.service';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'informacoes-gato',
  templateUrl: './informacoes-gato.component.html',
  styleUrls: ['./informacoes-gato.component.css']
})
export class InformacoesGatoComponent implements OnInit {

  listaRacas: any;
  gatoSelecionado: Gato;
  exibeGato: boolean;

  constructor(private gatoService: GatoService) { }
  
  ngOnInit(): void {
    this.listarRacas();
  }

  //BUSCA A INFORMACAO DO GATO QUANDO SELECIONADA UMA RACA
  onChange(raca) {
    this.gatoService.buscarGatoByRaca(raca)
      .subscribe(
        response => { //SUCESSO NA REQUISICAO      
          this.gatoSelecionado = response;
          console.log(this.gatoSelecionado)
          this.exibeGato = true;
      },(error) => { //ERRO NA REQUISICAO
        console.log(error);
      });
  }

  //LISTA TODAS AS RACAS
  listarRacas(){   
    this.gatoService.listarRacas()
      .subscribe(
        response => { //SUCESSO NA REQUISICAO      
          this.listaRacas = response;
      },(error) => { //ERRO NA REQUISICAO
        console.log(error);

      });
  }

  

}
