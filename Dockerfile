ARG VERSION=0.0.1

# Usar una imagen base (Zulu OpenJDK 17)
FROM azul/zulu-openjdk:17

# Establecer el directorio de trabajo
WORKDIR /app

# Copiar el archivo JAR de acuerdo a la versión pasada
COPY target/api-${VERSION}.jar /app/api-${VERSION}.jar

# Exponer el puerto
EXPOSE 9191

# Ejecutar el archivo JAR
CMD ["java", "-jar", "api-${VERSION}.jar"]