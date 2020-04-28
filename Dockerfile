FROM java:8
FROM maven:alpine

WORKDIR /app

COPY . /app

RUN mvn -v
RUN mvn clean install -DskipTests
EXPOSE 8080
LABEL maintainer=“chathuranga.t@gmail.com”
ADD ./target/movie-soap-service-0.0.1-SNAPSHOT.jar movie-soap-service-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","movie-soap-service-0.0.1-SNAPSHOT.jar"]