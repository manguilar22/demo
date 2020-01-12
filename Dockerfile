FROM openjdk:12-oraclelinux7


# DEMO (RUN)
# docker run --name spring-kube -p 8080:8080 -e MYSQL_HOSTNAME=<mysql-ip> -d manguilar22/spring:kube
LABEL maintainer=manguilar22@gmail.com

WORKDIR /app

# Load Built JAR File
COPY ./build/libs/demo-0.0.1-SNAPSHOT.jar .

ENV MYSQL_HOSTNAME 127.0.0.1

EXPOSE 8080

ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom", "-jar", "demo-0.0.1-SNAPSHOT.jar"]
