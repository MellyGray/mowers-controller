# Mowers Controller API
Application that helps in controlling mowers with an input string.
# Getting started

## Build and start the application using docker
To run the application using Docker, first you will need to install docker.

To create the container and run the application you can use the make commands:

 ``` shell
 $ make up
 $ make docker-run
 ```
 Then you can run the tests in docker to ensure everything is working fine.

 ``` shell
 $ make docker-test
 ```

If you prefer you can use the docker commands directly 

 ``` shell
 $ docker-compose up -d
 $ docker exec the-crm-service ./gradlew :run --warning-mode all
 ```

## Steps for running the application locally

Ensure you have Java 17 installed https://docs.aws.amazon.com/corretto/latest/corretto-17-ug/downloads-list.html and run:

``` shell
 export JAVA_HOME=/usr/lib/jvm/java-17-amazon-corretto/
 ```

Then run the following commands:

``` shell
 $ make build
 $ make run
 $ make test
 ```

 ## Testing the endpoints
 To test the API manually you can use the postman collection included SEAT-CODE.postman_collection.json.

 Remember that the docker port would be http://localhost:8030 and the local host is http://localhost:8080 you will need to change it in postman depending on how you are running the application.

## TODO

Implement Tableau limit exception
Generate logs
Validate Intruction String
