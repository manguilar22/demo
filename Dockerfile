FROM openjdk:12-oraclelinux7

LABEL maintainer=manguilar22@gmail.com

WORKDIR /app

# Load Built JAR File
COPY /build/libs/demo-0.0.1-SNAPSHOT.jar .

ENV MYSQL_HOSTNAME=""
ENV MONGO_HOSTNAME=""

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "demo-0.0.1-SNAPSHOT.jar"]

