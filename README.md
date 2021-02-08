# Cats API

## Informações Frontend
- Tecnologoias utilizadas: Angular 9
- Serviços AWS: S3 ([link](http://app-cats.s3-website-sa-east-1.amazonaws.com/inicio))
- Repositório: github.com/Jonathan-eng-jur/cats-api/tree/main/front-end/cats
- Procedimentos para rodar local:
  1. Realizar o download ou realizar o clone da aplicação pelo link do repositório mencionado anteriormente;
  2. Acessar a pasta raiz da aplicação via terminal;
  3. Digitar o comando "npm install" para instalar todas as dependências do projeto;
  4. Digitar o comando "npm start" para rodar o projeto localmente;
  5. Utilizar o navegador de sua preferência e acessar a url através desse ([link](http://localhost:4200));
  
## Informações Backend
- Tecnologoias utilizadas: Java e Spring Boot
- Serviços AWS: EC2 ([link](http://ec2-100-25-31-214.compute-1.amazonaws.com:8080))
- Repositório: github.com/Jonathan-eng-jur/cats-api/tree/main/cats-api
- Infra: Docker ([link](https://hub.docker.com/r/advogatoblackshark17/cadastro))
- Documentação: ([link](https://app.swaggerhub.com/apis-docs/Jonathan-eng-jur/cats-api/1.0.0))
- Procedimentos para rodar local:
  1. TBD

## Informações Banco de Dados
- Tecnologoias utilizadas: My SQL
- Serviços AWS: RDS
- Infra: Docker
- Procedimentos para rodar local:
  1. TODO
 
 
## Requisitos da aplicação
1. Listar Raças
<br />Requisito consite em poder listar e todas as raças em um input de seleção
<br />API: http://ec2-100-25-31-214.compute-1.amazonaws.com:8080/racas
<br />Método: GET
<br />Retorno: 
``` json
[
    "Abyssinian",
    "Aegean",
    "American Bobtail",
    "American Curl",
    "Khao Manee",
    "Korat",
    "Kurilian",
    "LaPerm",    
    "Somali",
    "Sphynx",
    "Tonkinese",
    "Toyger",
    "Turkish Angora",
    "Turkish Van",
    "York Chocolate"
]
```
![Lista de racas](https://imagens-cats.s3-sa-east-1.amazonaws.com/1-lista-raca.png)

2. Exibir informações de um gato
<br />Requisito consite em poder exibir as informações de um gato através da raça
<br />API: http://ec2-100-25-31-214.compute-1.amazonaws.com:8080/racas/gato/?raca=Abyssinian
<br />Método: GET
<br />Retorno: 
``` json
{
    "weight": {
        "imperial": "7  -  10",
        "metric": "3 - 5"
    },
    "id": "abys",
    "name": "Abyssinian",
    "cfa_url": "http://cfa.org/Breeds/BreedsAB/Abyssinian.aspx",
    "vetstreet_url": "http://www.vetstreet.com/cats/abyssinian",
    "vcahospitals_url": "https://vcahospitals.com/know-your-pet/cat-breeds/abyssinian",
    "temperament": "Active, Energetic, Independent, Intelligent, Gentle",
    "origin": "Egypt",
    "country_codes": "EG",
    "country_code": "EG",
    "description": "The Abyssinian is easy to care for, and a joy to have in your home. They’re affectionate cats and love both people and other animals.",
    "life_span": "14 - 15",
    "indoor": 0,
    "lap": 1,
    "alt_names": "",
    "adaptability": 5,
    "affection_level": 5,
    "child_friendly": 3,
    "dog_friendly": 4,
    "energy_level": 5,
    "grooming": 1,
    "health_issues": 2,
    "intelligence": 5,
    "shedding_level": 2,
    "social_needs": 5,
    "stranger_friendly": 5,
    "vocalisation": 1,
    "experimental": 0,
    "hairless": 0,
    "natural": 1,
    "rare": 0,
    "rex": 0,
    "suppressed_tail": 0,
    "short_legs": 0,
    "wikipedia_url": "https://en.wikipedia.org/wiki/Abyssinian_(cat)",
    "hypoallergenic": 0,
    "reference_image_id": "0XYvRd7oD",
    "image": {
        "id": "0XYvRd7oD",
        "width": 1204,
        "height": 1445,
        "url": "https://cdn2.thecatapi.com/images/0XYvRd7oD.jpg"
    }
}
```
![Informacoes Gato](https://imagens-cats.s3-sa-east-1.amazonaws.com/2-gato-by-raca.png)

3. Listar temperamentos
<br />Requisito consite em poder listar todos os temperamentos disponíveis
<br />API: http://ec2-100-25-31-214.compute-1.amazonaws.com:8080/temperamento
<br />Método: GET
<br />Retorno: 
``` json
[
    "Active",
    "Energetic",
    "Agile",
    "Fun-loving",
    "Relaxed",
    "Friendly",
    "Alert",
    "Demanding",
    "Dependent",
    "Patient",
    "calm",
    "Highly interactive",
    "Mischievous",
    "affectionate",
    "loyal",    
]
```
![Listar Temperamentos](https://imagens-cats.s3-sa-east-1.amazonaws.com/3-lista-temperamentos.png)

4. Listar raças pelo temperamento
<br />Requisito consite em poder listar todas as raças através do temperamento
<br />API: http://ec2-100-25-31-214.compute-1.amazonaws.com:8080/temperamento/?temperamento=Active
<br />Método: GET
<br />Retorno: 
``` json
[
    "Abyssinian",
    "Aegean",
    "American Shorthair",
    "Birman",
    "Cornish Rex",
    "Japanese Bobtail",
    "Javanese",
    "Korat",
    "Norwegian Forest Cat",
    "Ocicat",
    "Russian Blue",
    "Selkirk Rex",
    "Siamese"
]
```
![Listar Racas Pelo Temperamento](https://imagens-cats.s3-sa-east-1.amazonaws.com/4-racas-by-temperamento.png)

5. Listar origens
<br />Requisito consite em listar todas as origens
<br />API: http://ec2-100-25-31-214.compute-1.amazonaws.com:8080/origem
<br />Método: GET
<br />Retorno: 
``` json
[
    "Egypt",
    "Greece",
    "United States",
    "United Arab Emirates",
    "Australia",
    "France",
    "United Kingdom",
    "Burma",
    "Canada",
    "Cyprus",
    "Russia",
    "China",
    "Japan",
    "Thailand",
    "Isle of Man",
    "Norway",
    "Iran (Persia)",
    "Singapore",
    "Somalia",
    "Turkey"
]
```
![Listar Origens](https://imagens-cats.s3-sa-east-1.amazonaws.com/5-lista-origens.png)

6. Listar raça pela origem
<br />Requisito consite em poder listar todas as raças através da origem
<br />API: http://ec2-100-25-31-214.compute-1.amazonaws.com:8080/origem/?origem=Egypt
<br />Método: GET
<br />Retorno: 
``` json
[
    "Abyssinian",
    "Chausie",
    "Egyptian Mau"
]
```
![Listar Origens](https://imagens-cats.s3-sa-east-1.amazonaws.com/6-racas-by-origem.png)

