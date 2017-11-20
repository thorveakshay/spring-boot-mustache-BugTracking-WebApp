# spring-boot-mustache-BugTracking-WebApp

This project is created to learning and revise Spring, Spring Boot and JAVA. Spring Boot is a lightweight framework that takes most of the work out of configuring Spring-based applications.

Spring Boot + JDBC + MySQL + HikariCP + Mustache + Bootstrap 

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes. See deployment for notes on how to deploy the project on a live system.

### Prerequisites

What things you need to install the software and how to install them

		Spring Boot 1.5.2.RELEASE
		Spring 4.3.7.RELEASE
		jmustache 1.13
		Tomcat Embed 8.5.11
		Maven 3
		Java 8
		
		MySQL 5.7.x
		HikariCP 2.6

### Installing

A step by step series of examples that tell you have to get a development env running

Application was developed on OSX. Use brew to install above pachages.

Like
```
brew install mysql
```

## Deployment

In project directory run below commands.

```
mvn package
```

```
mvn spring-boot:run
```

## Built With

* [Spring Boot] (https://projects.spring.io/spring-boot/#quick-start) - The web framework used
* [jmustache](https://github.com/samskivert/jmustache) - Templating language. Used JAVA specifications.
* [Maven](https://maven.apache.org/) - Dependency Management
* [HikariCP](https://github.com/brettwooldridge/HikariCP) - A solid high-performance JDBC connection pool at last.
* [MySQL](https://dev.mysql.com/doc/) - The world's most popular open source relational database  

## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details

## Acknowledgments

* mkyong
* bootsnipp


