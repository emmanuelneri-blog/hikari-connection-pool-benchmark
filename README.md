# hikari-connection-pool-benchmark

Código fonte do Post: [Melhorando performance do pool de conexões com Hikari](https://wp.me/p5RSbg-jX).

## Pré requisito

- PostgresSQL 9.6
- Maven 3
- Java 8

## Preparando ambiente

1 - Criar base de dados 
 - ```psql```
 - ```create database cp-benchmarking```
 - ```create database cp-benchmarking-test```
 
2 - Buildar projeto
  - ```git clone https://github.com/emmanuelneri-blog/hikari-connection-pool-benchmark.git```
  - ```cd hikari-connection-pool-benchmark```
  - ```mvn clean compile```
  
## Executando testes

#### Tomcat (Default)
```mvn -Dtest=DefaultSourceTest test```

```
br.com.emmanuelneri.DefaultSourceTest : Started DefaultSourceTest in 13.579 seconds (JVM running for 14.295)
o.s.jdbc.datasource.init.ScriptUtils  : Executing SQL script from class path resource [reset-db.sql]
o.s.jdbc.datasource.init.ScriptUtils  : Executed SQL script from class path resource [reset-db.sql] in 25 ms.
br.com.emmanuelneri.DefaultSourceTest : DataSource: org.apache.tomcat.jdbc.pool.DataSource@18fdb6cf{...}
```

#### Hikari CP

```mvn -Dtest=HikariSourceTest test```

```
br.com.emmanuelneri.HikariSourceTest  : Started HikariSourceTest in 13.181 seconds (JVM running for 13.951)
o.s.jdbc.datasource.init.ScriptUtils  : Executing SQL script from class path resource [reset-db.sql]
o.s.jdbc.datasource.init.ScriptUtils  : Executed SQL script from class path resource [reset-db.sql] in 25 ms.
br.com.emmanuelneri.HikariSourceTest  : DataSource: HikariDataSource (HikariPool-1)
```
