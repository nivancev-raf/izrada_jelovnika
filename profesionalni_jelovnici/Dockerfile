FROM maven:3.8.5-openjdk-17 AS build
COPY . .
RUN mvn clean package -DskipTests

FROM eclipse-temurin:17-jdk-jammy
ENV LANG sr_RS.UTF-8
ENV LANGUAGE sr_RS:sr
ENV LC_ALL sr_RS.UTF-8

COPY --from=build /target/profesionalni_jelovnici-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8081
ENTRYPOINT ["java", "-jar", "app.jar"]