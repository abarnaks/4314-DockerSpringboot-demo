FROM maven:3.6.3-jdk-8 AS build
COPY /demo-v2/src /home/app/src
COPY /demo-v2/pom.xml /home/app
RUN mvn -f /home/app/pom.xml clean package

FROM openjdk:8
COPY --from=build /home/app/target/demo-v2-0.0.1-SNAPSHOT.jar /usr/src/myapp/demo-v2.jar
EXPOSE 5000
ENTRYPOINT ["java","-jar","/usr/src/myapp/demo-v2.jar"]