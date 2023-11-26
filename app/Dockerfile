# Use AdoptOpenJDK as the base image
FROM eclipse-temurin:17-jdk-jammy

# Set the working directory inside the container
WORKDIR /app

# Copy the packaged JAR file from the local filesystem to the container
COPY target/app-1.0-SNAPSHOT.jar .

# Expose the port that the application will run on
EXPOSE 8080

# Define the command to run your application
CMD ["java", "-jar", "app-1.0-SNAPSHOT.jar"]

# Example of passing arguments to the application
# CMD ["sh", "-c", "java -Dspring.profiles.active=prod -jar app.jar"]
