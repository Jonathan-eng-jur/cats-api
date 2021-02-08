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
- Procedimentos para rodar local:
  1. TBD

## Informações Banco de Dados
- Tecnologoias utilizadas: My SQL
- Serviços AWS: RDS
- Infra: Docker
- Procedimentos para rodar local:
  1. TODO
 
 
## Requisitos da aplicação
1. Listar Contatos
<br />Requisito consite em poder listar e exibir os contatos ja salvos no banco de dados na tela para o usuário.
<br />API: http://localhost:9080/itau/cadastro/all
<br />Método: GET
<br />Retorno: 
``` json
[
    {
        "nome_cadastro": "Jonathan Cavalcanti de Paula",
        "cpf_cadastro": "44281998802",
        "telefone_cadastro": "11992376816",
        "active": false
    }
]
```
![Lista de contatos](https://imagens-cadastro-contato.s3-sa-east-1.amazonaws.com/1-Listagem+de+contatos.jpeg)

2. Cadastrar contato
<br />Requisito consite em poder realizar o cadastro de um contato.
<br />API: http://localhost:9080/itau/cadastro
<br />Método: POST
<br />Body: 
``` json
{
    "company_name": "Jonathan",
    "company_document_number": "12345678999",
    "phone_number": "193"
}
```
![Dados Cadastro](https://imagens-cadastro-contato.s3-sa-east-1.amazonaws.com/2-Dados+Cadastro.jpeg)
![Contato Cadastrado](https://imagens-cadastro-contato.s3-sa-east-1.amazonaws.com/3-Cadastro+Sucesso.jpeg)
![Lista com Contato Cadastrado](https://imagens-cadastro-contato.s3-sa-east-1.amazonaws.com/4-Listando+Novo+Cadastro.jpeg)

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
  
