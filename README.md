
# Hotel Rating App
This codebase was created to demonstrate a backend application built with Java 11 + Spring Boot 3 including CRUD operations, authentication, routing and more.

This app helps users to rate a hotel services based on their experience. Once user is logged with correct email and password, he can post and see the reviews given by other users.

This app mainly contains 3 microservices-

1) UserServices: This service contains information about the user like his id, name and email.It uses MySQL as a database.

2) HotelServices: This service contains information about the hotel like his id, name, ratings given by users and feedback provided.It uses Oracle as a database.

3) RatingServices: This service provides ratings given to hotels based on userID and hotelId .It uses MongoDB as a database.

Apart from these services, Okta has been used to provide security to microservices.

Taking a closer look at the project structure, the main code of the application is located in the src/main/java directory. Additionally, configuration files and such can be found in the src/main/resources directory.

The core logic of the application is organized as follows:

~Controller: Processes HTTP requests, calls business logic, and generates responses.

~Service: Implements business logic and interacts with the database through Repositories.

~Repository: An interface for interacting with the database, implemented using Spring Data JPA.

Authentication and authorization management are implemented using Spring Security, with token-based authentication using Okta. Moreover, various features of Spring Boot are utilized to implement exception handling, logging, testing, and more.

Through this project, you can learn how to implement backend applications based on Spring and how to utilize various Spring technologies. Additionally, by implementing an application following the RealWorld specifications, it provides a basis for deciding which technology stack to choose through comparisons with various other technology stacks.

## Architecture
![Architecture](https://user-images.githubusercontent.com/60563826/234794845-a0052e04-3537-41dd-989d-c3180b9cb2f8.jpg)

## Technologies

**Spring Boot:** Server side framework

**JPA:** Entity framework

**Lombok:** Provides automated getter/setters

**Actuator:** Application insights on the fly

**Spring Security:** Spring's security 

**Devtools:** Support Hot-Code Swapping with live browser reload

**Okta:** API authentication

**H2:** H2 database embedded version


### Libraries

| Name  | Version | 
|----|----|
| spring-cloud-starter-netflix-eureka-client | latest  |
| spring-boot-starter-actuator | latest |
| okta | latest |
| spring-cloud-config | latest |
| spring-cloud-starter-gateway | latest |
| spring-cloud-starter-circuitbreaker-reactor-resilience4j | latest |
| spring-cloud-discovery | latest |
| spring-boot-starter-cache | latest |



