# syntax = docker/dockerfile:experimental
FROM maven:3.9.6-eclipse-temurin-21-alpine as builder
WORKDIR /app
COPY . .
RUN --mount=type=cache,target=/root/.m2 mvn clean package -DskipTests

FROM eclipse-temurin:21.0.2_13-jre-alpine
WORKDIR /app
COPY --from=builder /app/target/*.jar /app/app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]

# docker build -t maven-demo .