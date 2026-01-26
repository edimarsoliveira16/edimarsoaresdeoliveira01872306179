# Artists & Albums API

Projeto completo com Spring Boot, JWT, MinIO, Flyway e Docker.
ste pacote já vem organizado para produção, contendo:

Infraestrutura
Dockerfile
docker-compose.yml
API
PostgreSQL
MinIO
Banco de Dados
Flyway Migration (V1__create_tables.sql)
Estrutura inicial para artistas, álbuns e relacionamento N:N
Base para Segurança
Estrutura pronta para JWT (expansível)
Preparado para versionamento /api/v1

*Governança de código

.gitattributes (resolve CRLF definitivamente)

.gitignore

README.md inicial (executável + evolutivo)

Aplicação

Estrutura Spring Boot

Classe principal (ArtistsApiApplication)

Organização compatível com crescimento (security, domain, infra)
Abrir no IntelliJ / VS Code

Rodar:

mvn clean package
docker-compose up --build

Acessar:

API: http://localhost:8080

Swagger: http://localhost:8080/swagger-ui.html

MinIO: http://localhost:9000
