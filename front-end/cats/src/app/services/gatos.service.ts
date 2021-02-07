import { HttpClient, HttpParams } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Gato } from '../models/gato.model';

@Injectable({ providedIn: 'root' })
export class GatoService{
    
    API = "http://ec2-100-25-31-214.compute-1.amazonaws.com:8080";

    constructor(private http: HttpClient){}

    API_GET_LISTA_RACA():string {
        return this.API + "/racas";
    }

    API_GET_ORIGENS():string {
        return this.API + "/origem";
    }

    API_GET_TEMPERAMENTO():string {
        return this.API + "/temperamento";
    }

    API_GET_RACA(raca):string {
        return this.API + "/racas/gato/?raca=" + raca;
    }

    API_GET_TEMPERAMENTO_RACA(temperamento):string {
        return this.API + "/temperamento/?temperamento=" + temperamento;
    }

    API_ORIGEM_RACA(origem):string {
        return this.API + "/origem/?origem=" + origem;
    }

    //BUSCA INFORMACOES DO GATO ATRAVES DA RACA
    buscarGatoByRaca(raca:string){                    
        return this.http.get<Gato>(this.API_GET_RACA(raca));
    }

    //BUSCA A LISTA DE RACAS ATRAVES DO TEMPERAMENTO
    buscarRacasByTemperamento(temperamento:string){                    
        return this.http.get<string[]>(this.API_GET_TEMPERAMENTO_RACA(temperamento));
    }

    //BUSCA A LISTA DE RACAS ATRAVES DA ORIGEM
    buscarRacasByOrigens(origem:string){                    
        return this.http.get<string[]>(this.API_ORIGEM_RACA(origem));
    }

    //BUSCA A LISTA COMPLETA DE RACAS
    listarRacas(){        
        return this.http.get<string[]>(this.API_GET_LISTA_RACA());
    }

    //BUSCA A LISTA COMPLETA DE TEMPERAMENTO
    listarTemperamentos(){        
        return this.http.get<string[]>(this.API_GET_TEMPERAMENTO());
    }

    //BUSCA A LISTA COMPLETA DE ORIGEM
    listarOrigens(){        
        return this.http.get<string[]>(this.API_GET_ORIGENS());
    }

    

}