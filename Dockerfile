FROM openjdk:17-alpine

WORKDIR /app

COPY target/Oximeter*.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]