# Usar una imagen base (Zulu OpenJDK 17)
FROM azul/zulu-openjdk:17

# Establecer el directorio de trabajo
WORKDIR /app

# Copiar el archivo JAR con nombre fijo
COPY api.jar /app/api.jar

# Exponer el puerto
EXPOSE 9191

# Ejecutar el archivo JAR
CMD ["java", "-jar", "/app/api.jar"]
