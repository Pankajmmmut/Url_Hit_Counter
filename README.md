# Url_Hit_Counter
This is a special project of how to implement URL hit counting in a Spring Boot application. 
## Tools and Technologies
### Spring Boot:
* Spring Boot is an open-source Java framework developed by Pivotal (now VMware) that simplifies the process of building production-ready, stand-alone Spring-based applications.
* It is designed to make it easy to create microservices and web applications with minimal configuration and setup.
### Maven: 
* Apache Maven is a widely used build automation and project management tool for Java applications.
* It simplifies the build process by providing a declarative approach to project configuration and dependency management.
* Maven uses a Project Object Model (POM) file to define project configurations, including dependencies, plugins, and goals.
## Depedency
### Spring Web:
the Spring Web dependency is a fundamental part of the Spring ecosystem that provides the tools and infrastructure needed to build web applications, RESTful APIs, and web services in a scalable, maintainable, and modular way, leveraging the power of the Spring Framework.

## Controller
### UrlHitController:
In this controller, we have two endpoints:

` /username/{username}/hit `: Increments the hit count.
` /username/{username}/hit `: Returns the current hit count.
## Run the Application

You can run the Spring Boot application, and it will be accessible on http://localhost:8080.

## Testing

You can test the URL hit count feature by opening a web browser or a tool like Postman:

Access http://localhost:8080/username/{username}/hit to increment the hit count.
Access http://localhost:8080/username/{username}/count to retrieve the current hit count.
Every time you access the /hit URL, the hit count will increase, and you can retrieve it using the /count URL.

# Summary
this Api provides functionality to count the url hit by any specific user.



