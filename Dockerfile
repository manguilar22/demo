FROM openjdk:12-oraclelinux7


# DEMO (RUN)
#  sudo docker run --name spring-test -p 8082:8080 -e SPRING_DATASOURCE_URL=jdbc:mysql://localhost:3306/db_example -d spring:kube
######

LABEL maintainer=manguilar22@gmail.com

WORKDIR /app

# Load Built JAR File
COPY ./build/libs/demo-0.0.1-SNAPSHOT.jar .

#THYMELEAF
#ADD ./src/main/resources/templates /store

ENV MYSQL_HOSTNAME 127.0.0.1

EXPOSE 8080

ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom", "-jar", "demo-0.0.1-SNAPSHOT.jar"]
