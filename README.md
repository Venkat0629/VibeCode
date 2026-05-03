# VibeCode

## Spring Boot + Hibernate + Spring Data JPA Learning Path

If you want to learn this stack effectively, focus on it in layers.

### 1) Learn the prerequisites first
- Java basics (classes, interfaces, exceptions, collections, streams)
- OOP and SOLID fundamentals
- Maven or Gradle basics
- SQL essentials (SELECT, JOIN, GROUP BY, indexes)

### 2) Spring Boot fundamentals
Start by understanding:
- Dependency Injection and IoC container
- `@Component`, `@Service`, `@Repository`, `@Controller`, `@RestController`
- Configuration with `application.properties` / `application.yml`
- Profiles (`dev`, `test`, `prod`)

Build small REST APIs first before adding database complexity.

### 3) Hibernate core concepts
Hibernate is the ORM that maps Java objects to relational tables.

Key topics:
- Entities and mapping annotations: `@Entity`, `@Table`, `@Id`, `@GeneratedValue`
- Relationships: `@OneToOne`, `@OneToMany`, `@ManyToOne`, `@ManyToMany`
- Fetch types: LAZY vs EAGER
- Cascading and orphan removal
- Entity lifecycle and persistence context
- JPQL vs native SQL

### 4) Spring Data JPA
Spring Data JPA sits on top of JPA/Hibernate to reduce boilerplate.

Key topics:
- `JpaRepository` and CRUD methods
- Derived query methods (`findByEmail`, `findByStatusAndCreatedAtAfter`)
- `@Query` for custom JPQL/SQL
- Pagination and sorting (`Pageable`, `Page`)
- Projections and DTO mapping
- Specifications / dynamic filtering

### 5) Practical project roadmap (recommended)
Build this incrementally:
1. Create a Spring Boot REST app (Users + Posts).
2. Add PostgreSQL and configure datasource.
3. Create entities and repositories.
4. Add service layer with transactions.
5. Add validation with `jakarta.validation` (`@NotNull`, `@Email`, etc.).
6. Add global exception handling.
7. Add pagination + sorting endpoints.
8. Add authentication (JWT) after basics are stable.

### 6) What to practice deliberately
- Correct transaction boundaries with `@Transactional`
- Avoid N+1 queries (use joins/fetch joins/entity graphs where needed)
- Use DTOs for API responses (do not expose entities directly)
- Database migrations with Flyway or Liquibase
- Integration testing with Testcontainers

### 7) Suggested 6-week plan
- Week 1: Java + SQL refresh
- Week 2: Spring Boot REST fundamentals
- Week 3: Hibernate entity mapping + relationships
- Week 4: Spring Data JPA queries + pagination
- Week 5: Validation, exceptions, transactions, performance basics
- Week 6: Testing + mini production-style project

### 8) Common beginner mistakes to avoid
- Using EAGER fetch everywhere
- Returning entities directly from controllers
- Writing business logic in controllers instead of services
- Ignoring transaction boundaries
- Skipping SQL understanding while using ORM

### 9) Next step to start today
- Scaffold a simple Spring Boot project with:
  - Spring Web
  - Spring Data JPA
  - PostgreSQL Driver
  - Validation
- Implement one entity (`User`) end-to-end (controller, service, repository, migration).

Once that works, add a second related entity (`Post`) and practice relationship mapping and pagination.
