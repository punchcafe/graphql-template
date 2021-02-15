FROM openjdk:12
COPY build/libs/graphql-template-0.0.1-SNAPSHOT.jar /usr/app/
WORKDIR /usr/app
EXPOSE 8080
cmd ["java", "-jar", "graphql-template-0.0.1-SNAPSHOT.jar"]