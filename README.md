# 🚀 Spring Boot Direto das Trincheiras

[![Java](https://img.shields.io/badge/Java-17+-orange.svg)](https://www.oracle.com/java/)
[![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.x-brightgreen.svg)](https://spring.io/projects/spring-boot)
[![License](https://img.shields.io/badge/License-MIT-blue.svg)](LICENSE)

> Projeto prático de estudo do framework Spring Boot, desenvolvido durante o curso "Spring Boot Direto das Trincheiras" da DevDojo.

## 📋 Sobre o Projeto

Este repositório contém a implementação de uma API RESTful para gerenciamento de animes, utilizando as melhores práticas do ecossistema Spring. O projeto aborda desde conceitos fundamentais até recursos avançados do Spring Boot.

## ✨ Funcionalidades

- 📝 CRUD completo de Animes
- 🔍 Busca e filtragem de dados
- ✅ Validação de dados com Bean Validation
- 🗃️ Persistência com Spring Data JPA
- 📚 Documentação automática com SpringDoc OpenAPI
- 🧪 Testes unitários e de integração
- 🔒 Tratamento global de exceções
- 📊 Paginação e ordenação de resultados

## 🛠️ Tecnologias Utilizadas

- **Java 17+** - Linguagem de programação
- **Spring Boot 3.x** - Framework principal
- **Spring Data JPA** - Persistência de dados
- **Spring Web** - API REST
- **H2 Database** - Banco de dados em memória (desenvolvimento)
- **MySQL/PostgreSQL** - Banco de dados (produção)
- **Lombok** - Redução de boilerplate
- **MapStruct** - Mapeamento de DTOs
- **SpringDoc OpenAPI** - Documentação da API
- **Maven** - Gerenciamento de dependências

## 📁 Estrutura do Projeto

```
spring-boot-direto-das-trincheiras/
├── Anime-service/
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/
│   │   │   │   └── com/
│   │   │   │       └── devdojo/
│   │   │   │           ├── controller/      # Endpoints REST
│   │   │   │           ├── domain/          # Entidades JPA
│   │   │   │           ├── dto/             # Data Transfer Objects
│   │   │   │           ├── repository/      # Repositórios JPA
│   │   │   │           ├── service/         # Lógica de negócio
│   │   │   │           ├── exception/       # Exceções customizadas
│   │   │   │           ├── handler/         # Tratamento de erros
│   │   │   │           ├── mapper/          # Conversão DTO/Entity
│   │   │   │           └── config/          # Configurações
│   │   │   └── resources/
│   │   │       ├── application.yml          # Configurações da aplicação
│   │   │       └── data.sql                 # Dados iniciais
│   │   └── test/
│   │       └── java/                        # Testes
│   └── pom.xml
├── .gitignore
└── README.md
```

## 🚀 Como Executar

### Pré-requisitos

- Java 17 ou superior
- Maven 3.8+
- IDE de sua preferência (IntelliJ IDEA, Eclipse, VS Code)

### Passos

1. **Clone o repositório**
```bash
git clone https://github.com/DiegoLimaInCode/spring-boot-direto-das-trincheiras.git
cd spring-boot-direto-das-trincheiras
```

2. **Navegue até o módulo Anime-service**
```bash
cd Anime-service
```

3. **Execute com Maven**
```bash
./mvnw spring-boot:run
```

Ou compile e execute o JAR:
```bash
./mvnw clean package
java -jar target/anime-service-0.0.1-SNAPSHOT.jar
```

4. **Acesse a aplicação**
- API: http://localhost:8080
- Documentação Swagger: http://localhost:8080/swagger-ui.html
- H2 Console: http://localhost:8080/h2-console

## 📡 Endpoints da API

### Animes

| Método | Endpoint | Descrição |
|--------|----------|-----------|
| GET | `/api/animes` | Lista todos os animes (com paginação) |
| GET | `/api/animes/{id}` | Busca anime por ID |
| GET | `/api/animes/find?name=` | Busca anime por nome |
| POST | `/api/animes` | Cria novo anime |
| PUT | `/api/animes/{id}` | Atualiza anime existente |
| DELETE | `/api/animes/{id}` | Remove anime |

### Exemplo de Request (POST)

```json
{
  "name": "Attack on Titan",
  "episodes": 75,
  "genre": "Action, Drama"
}
```

### Exemplo de Response

```json
{
  "id": 1,
  "name": "Attack on Titan",
  "episodes": 75,
  "genre": "Action, Drama",
  "createdAt": "2024-01-23T10:30:00"
}
```

## 🧪 Testes

Execute os testes com:

```bash
./mvnw test
```

Para relatório de cobertura:

```bash
./mvnw clean test jacoco:report
```

## 🔧 Configuração

### application.yml

```yaml
spring:
  datasource:
    url: jdbc:h2:mem:testdb
    username: sa
    password: 
  jpa:
    hibernate:
      ddl-auto: update
    show-sql: true

server:
  port: 8080
```

### Perfis de Ambiente

- **dev** - Desenvolvimento com H2
- **prod** - Produção com MySQL/PostgreSQL

Executar com perfil específico:
```bash
./mvnw spring-boot:run -Dspring-boot.run.profiles=prod
```

## 📚 Aprendizados

Este projeto cobre os seguintes conceitos:

- ✅ Arquitetura REST
- ✅ Injeção de Dependências
- ✅ Spring Data JPA e relacionamentos
- ✅ Validação com Bean Validation
- ✅ Tratamento global de exceções
- ✅ DTOs e MapStruct
- ✅ Paginação e ordenação
- ✅ Documentação com OpenAPI/Swagger
- ✅ Testes com JUnit e MockMvc
- ✅ Profiles do Spring
- ✅ Configurações externalizadas

## 🤝 Contribuindo

Contribuições são bem-vindas! Sinta-se à vontade para:

1. Fazer um fork do projeto
2. Criar uma branch para sua feature (`git checkout -b feature/NovaFuncionalidade`)
3. Commit suas mudanças (`git commit -m 'Adiciona nova funcionalidade'`)
4. Push para a branch (`git push origin feature/NovaFuncionalidade`)
5. Abrir um Pull Request

## 📝 Licença

Este projeto está sob a licença MIT. Veja o arquivo [LICENSE](LICENSE) para mais detalhes.

## 👨‍💻 Autor

**Diego Lima**

- GitHub: [@DiegoLimaInCode](https://github.com/DiegoLimaInCode)
- LinkedIn: [diego-lima]([https://www.linkedin.com/in/seu-perfil](https://www.linkedin.com/in/diego-lima-118556288/))

## 🙏 Agradecimentos

- [DevDojo](https://devdojo.academy/) - Pelo excelente curso
- Comunidade Spring Boot
- Todos que contribuíram com o projeto

---

⭐ Se este projeto foi útil para você, considere dar uma estrela!

📧 Dúvidas? Abra uma [issue](https://github.com/DiegoLimaInCode/spring-boot-direto-das-trincheiras/issu
