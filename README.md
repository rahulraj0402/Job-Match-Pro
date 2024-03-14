# Job Match Pro

## Overview
Job Match Pro is a job application system designed to match job seekers with relevant job opportunities offered by various companies. It consists of three microservices - Jobs, Companies, and Reviews, developed using Spring Boot framework. Each microservice exposes REST endpoints to facilitate interaction with the system. Docker is utilized for managing PostgreSQL databases associated with the microservices.

## Microservices

### 1. Jobs Microservice
- Manages job postings and related operations.
- Provides endpoints for job creation, retrieval, updating, and deletion.
- Allows searching for jobs based on criteria such as title, location, and skills required.

### 2. Companies Microservice
- Handles company information and related functionalities.
- Offers endpoints for creating, retrieving, updating, and deleting company profiles.
- Supports searching for companies based on criteria like name, industry, and location.

### 3. Reviews Microservice
- Manages reviews for companies.
- Enables users to add, view, update, and delete reviews for companies.
- Provides endpoints for retrieving reviews by company or user.

## Technologies Used
- **Spring Boot**: For building the microservices.
- **Docker**: Used for containerizing the PostgreSQL databases associated with the microservices.
- **PostgreSQL**: Database management system.
- **RESTful API**: Communication between microservices and clients.
- **Java**: Primary programming language for the project.

## Setup
1. **Clone the Repository**: Clone the Job Match Pro repository to your local machine.
   git clone https://github.com/rahulraj0402/Job-Match-Pro.git

2.  **Build Docker Containers**: Navigate to the project directory and build the Docker containers.

  
