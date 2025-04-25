# Multi-stage: build with Maven, run with JDK
FROM maven:3.9.6-eclipse-temurin-17-alpine AS build

RUN mvn package -DskipTests

FROM eclipse-temurin:17-jdk-alpine

COPY --from=build /target/*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]
