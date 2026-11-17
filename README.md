# Consumo de API externa com Spring Boot

API em **Spring Boot** que consome uma API externa de delivery e expõe os dados em endpoints próprios, usando DTOs e uma camada de serviço.

## Endpoints
| Método | Rota |
|---|---|
| GET | `/my-delivery-api/users` · `/users/{id}` |
| GET | `/my-delivery-api/restaurants` · `/restaurants/{id}` |
| GET | `/my-delivery-api/foods` · `/foods/{id}` |

A URL da API de origem fica em `application.properties` (`api.delivery.base-url`).

## Conceitos praticados
- Consumo de APIs REST com `RestTemplate`
- Mapeamento de respostas JSON em DTOs
- Separação em controller, service e config
- Configuração externa com `@Value`

## Tecnologias
Java 24 · Spring Boot 3.5 · Maven

## Como rodar
```bash
./mvnw spring-boot:run
# http://localhost:8080/my-delivery-api/restaurants
```
