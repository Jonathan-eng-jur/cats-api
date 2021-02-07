import { Component, OnInit } from '@angular/core';
import { GatoService } from './../../services/gatos.service';

@Component({
  selector: 'informacoes-temperamento-racas',
  templateUrl: './informacoes-temperamento-racas.component.html',
  styleUrls: ['./informacoes-temperamento-racas.component.css']
})
export class InformacoesTemperamentoRacasComponent implements OnInit {

  listaTemperamentos:any;  
  listaRacas: any;  
  exibeLista: boolean;
  temperamentoSelecionado: string;

  constructor(private gatoService: GatoService) { }

  ngOnInit(): void {
    this.listarTemperamentos();
  }

  //BUSCA A LISTA DE RACAS QUANDO INFORMADO UM TEMPERAMENTO
  onChange(temperamento) {
    this.gatoService.buscarRacasByTemperamento(temperamento)
      .subscribe(
        response => { //SUCESSO NA REQUISICAO      
          this.listaRacas = response;    
          this.temperamentoSelecionado = temperamento;
          this.exibeLista = true;
      },(error) => { //ERRO NA REQUISICAO
        console.log(error);
      });
  }

  //LISTA TODOS OS TEMPERAMENTOS
  listarTemperamentos(){
    this.gatoService.listarTemperamentos()
      .subscribe(
        response => { //SUCESSO NA REQUISICAO      
          this.listaTemperamentos = response;
      },(error) => { //ERRO NA REQUISICAO
        console.log(error);
      });
  }

}
