FROM openjdk:17-jdk-slim
VOLUME /tmp
COPY api.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
