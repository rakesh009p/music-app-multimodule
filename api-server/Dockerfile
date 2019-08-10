##pull jdk image
FROM openjdk:11
##add/copy jar file from target to docker file system
ADD ./target/gatewayapidemo-0.0.1-SNAPSHOT.jar /usr/src/gatewayapidemo-0.0.1-SNAPSHOT.jar
WORKDIR usr/src
#run the jar file
EXPOSE 8085
ENTRYPOINT ["java","-jar","gatewayapidemo-0.0.1-SNAPSHOT.jar"]
