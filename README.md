# TaskAPI - API de Lista de Tarefas (Spring Boot)

API REST simples desenvolvida em Spring Boot para praticar conceitos básicos de HTTP, verbos REST, códigos de status e manipulação de requisições.

## Tecnologias
- Java 21
- Spring Boot 3.5
- Maven

## Endpoints

### GET `/tasks`
Retorna a lista de tarefas atuais.

**Exemplo de resposta:**
```json
["Ler documentação", "Estudar HTTP"]


Durante o desenvolvimento e os testes da API, foram enfrentados os seguintes desafios:

Aprender a utilizar o Postman: nunca havia utilizado antes. Foi necessário entender como definir o método POST, ajustar o cabeçalho Content-Type para text/plain, e enviar dados no corpo da requisição.

Criar uma API REST em Java com Spring Boot: essa foi a primeira experiência desenvolvendo endpoints REST com Java, e foi necessário entender conceitos como anotações @RestController, @PostMapping, ResponseEntity, status HTTP e validações.