ARG VERSION=0.0.1

FROM azul/zulu-openjdk:17

WORKDIR /app

COPY target/api-${VERSION}.jar /app/api-${VERSION}.jar

EXPOSE 9091:9091

CMD ["java", "-jar", "api-${VERSION}.jar"]