FROM openjdk:11
##add/copy jar file from target to docker file system
ADD ./target/eureka-0.0.1-SNAPSHOT.jar /usr/src/eureka-0.0.1-SNAPSHOT.jar
WORKDIR usr/src
#run the jar file
ENTRYPOINT ["java","-jar","eureka-0.0.1-SNAPSHOT.jar"]