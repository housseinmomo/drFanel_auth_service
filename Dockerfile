FROM openjdk:8-jdk-alpine
WORKDIR /app
COPY ./target/*.jar ./app/myapp.jar
ENTRYPOINT ["java", "-jar", "/app/myapp.jar"]
EXPOSE 8080
