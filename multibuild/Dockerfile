FROM maven:3.5.2-jdk-8-alpine AS MAVEN_BUILD
MAINTAINER "Anthony Mogrovejo"
ARG JAR_FILE=app-0.1.jar

WORKDIR build
COPY pom.xml /build/
COPY src /build/src/
COPY target /build/

RUN mvn clean package 

FROM openjdk:8-jre-alpine
WORKDIR app
COPY --from=MAVEN_BUILD /build/target/${JAR_FILE} /app/

ENTRYPOINT ["java","-jar","/app/app-0.1.jar"]
