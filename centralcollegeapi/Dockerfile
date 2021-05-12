FROM openjdk:8

RUN apt-get -o Acquire::Check-Valid-Until=false -o Acquire::Check-Date=false update && apt-get install -y curl

EXPOSE 8080

ARG JAR_FILE=target/centralcollegeapi-0.0.1-SNAPSHOT.jar

ADD ${JAR_FILE} app.jar

ENTRYPOINT ["java", "-jar", "/app.jar"]