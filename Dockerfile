FROM maven:3.8.5-openjdk-17

WORKDIR /photo_app
COPY pom.xml pom.xml
COPY src/main/java src/main/java
RUN mvn clean install
COPY src/main/resources src/main/resources
EXPOSE 8080

CMD mvn spring-boot:run