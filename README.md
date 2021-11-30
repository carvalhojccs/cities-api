# CITIES-API
## API REST desenvolvida durante o Bootcamp TQI Java Developer
### Tecnologias
- Java 11
- Springboot
- Gradle
### IDE
- IntelliJ
### Banco de dados
- PostgreSQL

A API foi publblicade no **Heroku**, no endereço <https://vast-tundra-88915.herokuapp.com> com os seguintes _end points_:
1. /cities
2. /states
3. /contries
4. /distances/by-cube _recebe como parâmetro o código da cidade de origem (from) e o código da cidade de destino (to) e retorna a distância entre elas em metros!_ 
**Ex. /distances/by-cube?from=4929&to=5254**
5. distances/by-points _recebe como parâmetro o código da cidade de origem (from) e o código da cidade de destino (to) e retorna a distância entre elas em milhas!_
**Ex. /distances/by-points?from=4929&to=5254**
