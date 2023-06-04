# Vehicle-Rental-Management-API

This is a vehicle rental management system developed using Spring Boot and PostgreSQL.

<details>
  <summary><b>Technologies Used</b></summary>

- Java
- Spring Boot
- Spring Data JPA
- PostgreSQL
- Postman (For API testing)

</details>
<details>
  <summary><b>Prerequisites</b></summary>

- Java Development Kit (JDK) 8 or higher
- Maven
- PostgreSQL database

</details>

<details>
<summary><b>Getting Started</b></summary>

To get started with this project, follow the instructions below:

1. Clone the repository.
  ```bash
git clone <repository-url>
  ```
2. Install the necessary dependencies.
  ```bash
  mvn install
  ```
3. Configure the database connection.
  ```bash
  spring.datasource.url=jdbc:postgresql://localhost:5432/your-data-base-name
  spring.datasource.username=username
  spring.datasource.password=password
  ```
4. Build and run the application.
  ```bash
  mvn spring-boot:run
  ```
  5. The application will start running at http://localhost:8080.
</details>
  
<details>
<summary><b>Project Structure</b></summary>

```bash
Project Structure
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com.example.vehiclerental
│   │   │       ├── controller # Contains the REST API controllers
│   │   │       ├── model # Contains the entity classes
│   │   │       ├── repository # Contains the Spring Data JPA repositories
│   │   │       ├── service # Contains the service classes
│   │   │       └── VehicleRentalApplication.java # Main application class
│   │   └── resources
│   │       └── application.properties # Configuration file
│   └── test
│       └── java
│           └── com.example.vehiclerental
│               ├── controller # Contains the controller unit tests
│               └── service # Contains the service unit tests
└── pom.xml

```
</details>
  <details>
  <summary><b>API Endpoints</b></summary>

The following API endpoints are available:

- GET: Retrieves all vehicles.
    ```bash
    http://localhost:8080/vehicles
    ```
- GET : Retrieves a vehicle by ID.
    ```bash
    http://localhost:8080/vehicles/{{id}}
    ```
- GET : Retrieves vehicles by make.
    ```bash
    http://localhost:8080/vehicles/make/{{make}}
    ```
- GET : Retrieves vehicles by model.
    ```bash
    http://localhost:8080/vehicles/model/{{model}}
    ```
- GET : Retrieves vehicles by year.
    ```bash
    http://localhost:8080/vehicles/year/{{year}}
    ```
- POST : Creates a new vehicle.
    ```bash
    http://localhost:8080/vehicles/vehicles/post
    ```
- PUT /vehicles/{id}: Updates an existing vehicle.
    ```bash
    http://localhost:8080/vehicles/{{id}}
    ```
- DELETE : Deletes a vehicle by ID.
    ```bash
    http://localhost:8080/vehicles/{{id}}
    ```
All these endpoints are tested using Postman.
</details>

  
## Contributions

Contributions are welcome! If you have any ideas, suggestions, or improvements, please feel free to open an issue or submit a pull request. Together, we can make this project even better.

Thank you for your interest in contributing to the Vehicle Rental Management API!

  


