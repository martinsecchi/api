FROM azul/zulu-openjdk:17

WORKDIR /app

COPY target/demo-0.0.1-SNAPSHOT.jar /app/api-0.0.1-SNAPSHOT.jar

EXPOSE 9090:9090

CMD ["java", "-jar", "api-0.0.1-SNAPSHOT.jar"]