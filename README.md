# Koala-Backend

## Description
This application is the backend service for the Seednavio application, it provides all needed endpoints to that frontend application, 
enables the frontend to view all Seedlings who are joining SAP/Signavio in 2021.

The app is using an H2 in-memory database, so each time the application is restarted, the data in the database will be reset.

## Endpoints
```bash
GET .../api/profile
```
The http response from this Endpoint will return a list containing the information about the Seedlings who are joining SAP/Signavio in 2021.

## How to run the application locally

In the command line:

```bash
./gradlew clean build

./gradlew bootRun
```

Then open following link in your web browser, and you will see the application welcome page

```bash
http://localhost:7000
```

## Project Architecture

We utilized the Spring Boot framework to build our backend app. And we have four components in our app, the Profile controller, the Profile service, the Profile model and the H2 database. 

![Architecture](https://mengli-public-bucket.s3.eu-central-1.amazonaws.com/2021bootcamp/architecture.png)