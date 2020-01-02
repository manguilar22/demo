# Demo 

Practice,Practice,Practice 

### Learning New Tools 
* Actuator, Prometheus, ... 
* MySQL & Hibernate 
* Kubernetes Deployment 
* Micro-service Architecture 

### Deployments 

#### Docker 
* MYSQL 
    * docker run --name spring-mysql -p 3306:3306 -e MYSQL_ROOT_PASSWORD=password -d mysql:5.7
* Spring
    * docker run --name spring-app -p 8080:8080 -e MYSQL_HOSTNAME=localhost -d manguilar22/spring:kube 

#### Docker -Compose 
* docker-compose up -d 
* docker-compose ps -a 

#### Kubernetes 
* Full-Stack: **One Pod, Two Containers** 
    * *kubectl apply -f kubernetes/spring-fullstack.yaml*
* Backend: **One Pod, One Container** 
    * *kubectl apply -f kubernetes/spring-mysql.yaml*    