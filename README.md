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
<br />Método: POST
<br />Body: 
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

3. Editar contato
<br />Requisito consite em poder realizar a edição de um contato.
<br />API: http://localhost:9080/itau/cadastro/{cpf}
<br />Método: PUT
<br />Body: 
``` json
{
    "company_name": "Ricardo",
    "company_document_number": "123456999",
    "phone_number": "11999999999"
}
```
![Dados Edicao Contato](https://imagens-cadastro-contato.s3-sa-east-1.amazonaws.com/5-Editando+Dados+Cadastro.jpeg)
![Contato Editado](https://imagens-cadastro-contato.s3-sa-east-1.amazonaws.com/6-Cadastro+Editado+com+Sucesso.jpeg)

4. Excluir Contato
<br />Requisito consite em poder excluir um contato.
<br />API: http://localhost:9080/itau/cadastro/{cpf}
<br />Método: DELETE
![Lista para Excluir](https://imagens-cadastro-contato.s3-sa-east-1.amazonaws.com/8-Lista+para+Excluir.JPG)
![Lista para Excluir](https://imagens-cadastro-contato.s3-sa-east-1.amazonaws.com/9-Contato+Excluido.JPG) 
  
