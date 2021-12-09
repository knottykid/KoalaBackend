# Koala-Backend

### Description
This application is the backend service for the Koala-Frontend application, it provides all needed endpoints to frontend application, 
enables the frontend to view all Seedlings who are joining SAP/Signavio in 2021.

The app is using an H2 in-memory database, so each time the application is restarted, the data in the database will be reset.

### Endpoints
```bash
GET .../api/profile
```
The http response from this Endpoint will return a list containing the information about the Seedlings who are joining SAP/Signavio in 2021.

### How to run the application

```bash
./gradlew clean build

./gradlew bootRun
```
Then open following address in your web browser
```bash
http://localhots:7000
```