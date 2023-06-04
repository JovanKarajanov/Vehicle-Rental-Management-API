# Vehicle-Rental-Management-API

This is a vehicle rental management system developed using Spring Boot and PostgreSQL.

<details>
  <summary><b>Technologies Used</b></summary>

- Java
- Spring Boot
- Spring Data JPA
- PostgreSQL

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

- GET /vehicles: Retrieves all vehicles.
- GET /vehicles/{id}: Retrieves a vehicle by ID.
- GET /vehicles/make/{make}: Retrieves vehicles by make.
- GET /vehicles/model/{model}: Retrieves vehicles by model.
- GET /vehicles/year/{year}: Retrieves vehicles by year.
- POST /vehicles: Creates a new vehicle.
- PUT /vehicles/{id}: Updates an existing vehicle.
- DELETE /vehicles/{id}: Deletes a vehicle by ID.

</details>

  
## Contributions

Contributions are welcome! If you have any ideas, suggestions, or improvements, please feel free to open an issue or submit a pull request. Together, we can make this project even better.

Thank you for your interest in contributing to the Vehicle Rental Management API!

  


