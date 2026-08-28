```properties
# Application
spring.application.name=student-management

# Server
server.port=8080

# ===============================
# MySQL Database Configuration
# ===============================

spring.datasource.url=jdbc:mysql://localhost:3306/studentdb?useSSL=false&serverTimezone=UTC
spring.datasource.username=root
spring.datasource.password=root

spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver

# ===============================
# JPA / Hibernate
# ===============================

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true

# ===============================
# H2 Console - optional
# ===============================

spring.h2.console.enabled=true
spring.h2.console.path=/h2-console
```
