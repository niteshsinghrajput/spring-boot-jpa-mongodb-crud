# Spring Boot JPA MongoDB CRUD Example

This is a simple Spring Boot project that demonstrates CRUD (Create, Read, Update, Delete) operations using JPA (Java Persistence API) and MongoDB.

## Prerequisites

Before running this project, make sure you have the following prerequisites:

- Java 11 or higher installed
- Gradle 7.5.1 installed
- MongoDB installed and running

## Setup

1. Clone the repository:

   ```bash
   git clone https://github.com/niteshsinghrajput/spring-boot-jpa-mongodb-crud.git

2. Navigate to the project directory:
    
    ```bash
    cd spring-boot-jpa-mongodb-crud
   
3. Build the project

    ```bash
    ./gradlew clean build
   
4. Run the application

   ```bash
    java -jar .\build\libs\spring-boot-jpa-mongodb-crud-0.0.1-SNAPSHOT.jar

## Usage
Once the application is running, you can access the API endpoints using a tool like Postman or cURL.

#### The API supports the following endpoints:

* GET `/api/applications`: Get all applications
  * Sample URL: `http://localhost:8080/api/applications`
* GET `/api/applications/{id}`: Get an application by ID
  * Sample URL: `http://localhost:8080/api/applications/6477de82cd1ce97ba1d43ab0`
* POST `/api/applications`: Create a new application
  * Sample URL: `http://localhost:8080/api/applications`
  * Sample Request Payload: 
    ```json
      {
         "name": "Hostipal Management",
         "description": "To manage hospitals activities",
         "owner": "Nitesh S Rajput"
       }
    ```
* PUT `/api/applications/{id}`: Update an existing application
  * Sample URL: `http://localhost:8080/api/applications/6477de82cd1ce97ba1d43ab0`
  * Sample Request Payload:
    ```json
      {
         "name": "Hospital Management",
         "description": "To manage hostipals activities",
         "owner": "Nitesh S Rajput"
      }
    ```
* DELETE /api/applications/{id}: Delete an application
  * Sample URL: `http://localhost:8080/api/applications/6477de82cd1ce97ba1d43ab0`

Make sure to replace {id} with the actual ID of the application when using the specific endpoints.

## Configuration
The application configuration can be found in the application.properties file. You can modify the MongoDB connection details, such as the host, port, and database name, in this file.
   