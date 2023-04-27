
# Hotel Rating App

This app helps users to rate a hotel services based on their experience. Once user is logged with correct email and password, he can post and see the reviews given by other users.

This app mainly contains 3 microservices-

1) UserServices: This service contains information about the user like his id, name and email.It uses MySQL as a database.

2) HotelServices: This service contains information about the hotel like his id, name, ratings given by users and feedback provided.It uses Oracle as a database.

3) RatingServices: This service provides ratings given to hotels based on userID and hotelId .It uses MongoDB as a database.

Apart from these services, Okta has been used to provide security to microservices.

## Architecture


## System Spec

### Tech Spec
| Name  |
|----|
| Springboot 2.7.8  |
| Java 11 |
| Spring Cloud Gateway |
|  |


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



