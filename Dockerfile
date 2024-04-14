FROM openjdk:17-jdk-alpine
COPY target/*.jar crud-app.jar
EXPOSE 9090
ENTRYPOINT ["java", "-jar", "/crud-app.jar"]

