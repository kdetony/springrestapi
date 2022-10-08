FROM maven:3.5.2-jdk-8-alpine AS MAVEN_BUILD
MAINTAINER "Anthony Mogrovejo"
ARG JAR_FILE=target/app-0.1.jar

COPY pom.xml /build/
COPY src /build/src/
WORKDIR /build/
RUN mvn clean package 

FROM openjdk:8-jre-alpine
WORKDIR /app
COPY --from=MAVEN_BUILD /build/${JAR_FILE} /app/app.jar

ENTRYPOINT ["java","-jar","/app.jar"]
