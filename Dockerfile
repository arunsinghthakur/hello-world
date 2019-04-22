FROM openjdk:8-jdk-alpine
VOLUME /tmp
EXPOSE 8000
ADD /target/hello-world-0.0.1-SNAPSHOT.jar hello-world-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java", "-jar", "hello-world-0.0.1-SNAPSHOT.jar"] 