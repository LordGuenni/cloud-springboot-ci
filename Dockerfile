FROM eclipse-temurin:25-jre
LABEL maintainer="docker@thb.de"
WORKDIR /app
ADD target/demo-0.0.1-SNAPSHOT.jar /app/service.jar
RUN groupadd -r spring && useradd -r -g spring spring
USER spring:spring
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/app/service.jar"]
