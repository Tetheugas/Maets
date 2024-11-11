# Maets

**Maets** é um projeto de software construído utilizando o framework **Spring Boot**, com o propósito de fornecer uma arquitetura base para desenvolvimento de aplicativos web.

## Configurações do Projeto

- **Group ID:** `com.games.tetheugas`
- **Artifact ID:** `Maets`
- **Versão:** `0.0.1-SNAPSHOT`
- **Java Version:** `21`
- **Spring Boot Version:** `3.3.3`

## Dependências

O projeto utiliza as seguintes dependências:

1. **Spring Boot Starter Data JPA**  
   Fornece suporte para JPA com Spring Data e outras bibliotecas relacionadas.

2. **Lombok**  
   Biblioteca que reduz o código boilerplate, como getters, setters e construtores.

3. **Spring Boot Starter Thymeleaf**  
   Suporte para o mecanismo de templates Thymeleaf, usado para renderização de páginas HTML.

4. **Spring Boot Starter Web**  
   Necessária para criação de APIs REST e manipulação de requisições HTTP.

5. **H2 Database**  
   Banco de dados em memória para ambiente de desenvolvimento e testes. Escopo: `runtime`.

6. **PostgreSQL Driver**  
   Driver do banco de dados PostgreSQL, utilizado para integração com PostgreSQL em produção. Escopo: `runtime`.

7. **Spring Boot Starter Test**  
   Ferramentas de teste para desenvolvimento, incluindo JUnit, Hamcrest, e Mockito. Escopo: `test`.

## Construção e Execução

### Plugin Maven

- **Spring Boot Maven Plugin**  
  Facilita o processo de build e empacotamento do projeto Spring Boot, além de simplificar a execução do aplicativo.

### Comandos Úteis

- **Construção do projeto**
  ```bash
  mvn clean install