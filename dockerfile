# We use a Java Runtime Environment (JRE) as the base
FROM eclipse-temurin:25-jre-alpine

# Set the folder inside the container where our app will live
WORKDIR /app

# Copy the JAR file you just created into the container
COPY BankSystem.jar app.jar

# Tell Docker to run the JAR when the container starts
ENTRYPOINT ["java", "-jar", "app.jar"]