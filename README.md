# tripengine
Test Backend for the 4YFN Hackathon

## Project description
This is a basic web service for bus trips and stops written in kotlin. It manages three entities: Users, Trips and Stops.

* **User**: Can be DRIVER or PASSENGER. DRIVER users can create trips. PASSENGER users can ask for stops in the trip. 
* **Trip**: Created by a DRIVER, contains an origin and destination and the route bewteen those two. Can have STOPS.
* **Stop**: Created by a PASSENGER, represents a point in the TRIP route where the user want to get off the TRIP. Can be REQUESTED, ACCEPTED, REJECTED or CANCELLED. The PASSENGER requests the STOP, the DRIVER accepts or rejects that requested STOP or the same PASSENGER cancels it.

## Run the project
This is a maven spring boot based service, so running the main class or running the command `mvn spring-boot:run` will start the service locally.

## API Documentation
To see the API documentantio run the service and access http://localhost:8080/swagger-ui.html
