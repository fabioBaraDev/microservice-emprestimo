#
# Build stage
#
FROM maven:3.6.0-jdk-8-slim AS build
WORKDIR /home/app
COPY pom.xml .
RUN mvn dependency:resolve

COPY src/ /home/app/src/
RUN mvn package

#
# Package stage
#
FROM openjdk:8-jdk-alpine
COPY --from=build /home/app/target/*.jar /usr/local/lib/demo.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/usr/local/lib/demo.jar"]