FROM openjdk:8-jdk-alpine
VOLUME /tmp
EXPOSE 8000
ADD /target/hello-world.jar hello-world.jar

ENTRYPOINT ["java", "-jar", "hello-world.jar"] 