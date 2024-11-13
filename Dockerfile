FROM azul/zulu-openjdk:17
# Copiar el archivo JAR generado a la ruta correcta en el contenedor
COPY target/api-${VERSION}.jar /app.jar

# Comando para ejecutar el JAR
ENTRYPOINT ["java", "-jar", "/app.jar"]