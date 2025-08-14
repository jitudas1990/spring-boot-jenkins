FROM openjdk:17
EXPOSE 8080

# Fail fast if JAR doesn't exist
COPY target/*.jar devops-integration.jar

ENTRYPOINT ["java", "-jar", "devops-integration.jar"]
