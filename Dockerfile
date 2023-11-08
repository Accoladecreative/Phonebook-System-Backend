# Use an official OpenJDK runtime as a parent image
FROM openjdk:11-jre-slim

# Set the working directory in the container
WORKDIR /app

# Copy the JAR file into the container at /app
COPY target/your-spring-boot-app.jar /app/your-spring-boot-app.jar

# Make port 8080 available to the world outside this container
EXPOSE 8080

# Define environment variables
ENV JAVA_OPTS=""

# Run the JAR file
ENTRYPOINT ["sh", "-c", "java $JAVA_OPTS -jar your-spring-boot-app.jar"]
# Use an official OpenJDK runtime as a parent image
FROM openjdk:11-jre-slim

# Set the working directory in the container
WORKDIR /app

# Copy the JAR file into the container at /app
COPY target/com.kolade.0.0.1-SNAPSHOT.jar /app/snap.jar

# Make port 8080 available to the world outside this container
EXPOSE 8080

# Define environment variables
ENV JAVA_OPTS=""

# Run the JAR file
ENTRYPOINT ["sh", "-c", "java $JAVA_OPTS -jar your-spring-boot-app.jar"]
