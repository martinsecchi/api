FROM azul/zulu-openjdk:17

ARG JAR_FILE
COPY ${JAR_FILE} /app.jar

ENTRYPOINT ["java", "-jar", "/app.jar"]
EXPOSE 9191
