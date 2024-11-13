FROM openjdk:17-jdk-slim
VOLUME /tmp
COPY api.jar app.jar
ENV SPRING_PROFILES_ACTIVE=prod
ENTRYPOINT ["java","-jar","/app.jar"]
