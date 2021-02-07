import { Component, OnInit } from '@angular/core';
import { GatoService } from './../../services/gatos.service';

@Component({
  selector: 'informacoes-origem-racas',
  templateUrl: './informacoes-origem-racas.component.html',
  styleUrls: ['./informacoes-origem-racas.component.css']
})
export class InformacoesOrigemRacasComponent implements OnInit {

  listaOrigens: any;
  listaRacas:any;
  exibeLista: boolean;
  origemSelecionada: string;

  constructor(private gatoService: GatoService) { }

  ngOnInit(): void {
    this.listarOrigens();
  }

  //BUSCA A LISTA DE RACAS QUANDO INFORMADA UMA ORIGEM
  onChange(origem) {
    this.gatoService.buscarRacasByOrigens(origem)
      .subscribe(
        response => { //SUCESSO NA REQUISICAO
          this.listaRacas = response;          
          this.origemSelecionada = origem;
          this.exibeLista = true;
      },(error) => { //ERRO NA REQUISICAO
        console.log(error);
      });
  }

  //LISTA TODAS AS ORIGENS
  listarOrigens(){   
    this.gatoService.listarOrigens()
      .subscribe(
        response => { //SUCESSO NA REQUISICAO
          this.listaOrigens = response;                    
      },(error) => { //ERRO NA REQUISICAO
        console.log(error);
      });
  }

}
