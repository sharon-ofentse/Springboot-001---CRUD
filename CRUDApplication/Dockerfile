# Use an official maven image, 
FROM maven:3.8.7-eclipse-temurin-19 as build

USER root

# Install required dependencies
RUN apt -y update

# Create parent directories
RUN mkdir -p /data/Application/maven

# Working directory for the Springboot files
WORKDIR /data/Application/maven
COPY pom.xml .
COPY src/ src/
RUN mvn -f pom.xml clean package

# -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- --

# Use an official java image,
FROM eclipse-temurin:19

# Working directory for the Jar file
WORKDIR /data/Application/java

RUN apt -y update && apt -y install tzdata

# Setting timezone to timezone of your choice 
# not necessary in most projects but if you have multiple images in multiple containers, 
# its nice they have the same timezone, makes tracking multiple logs easier
RUN ln -fs /usr/share/zoneinfo/Africa/Johannesburg /etc/localtime && dpkg-reconfigure -f noninteractive tzdata

# Important Step, this will copy the jar file in the maven working directory, into the java working directory, 
COPY --from=build /data/Application/maven/target/*.jar CRUDApplication-0.0.1-SNAPSHOT.jar

# Default command to run when the container starts
CMD ["java","-jar","/data/Application/java/CRUDApplication-0.0.1-SNAPSHOT.jar"]