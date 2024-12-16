# Notes

## Docker Publish 
    docker build -t yourusername/postgresql:v1 .
    docker build -t yourusername/mongodb:v1 .
    docker push yourusername/postgresql:v1
    docker push yourusername/mongodb:v1

## Docker Image 
    
    PostgreSQL
    userName: postgre
    password: root 
    DB: AuthDB
```bash
docker run -d --name postgresql -p 5432:5432 omerdeniz/postgresql:v1
```
    MongoDB
    userName: admin
    password: root
    DB: UserProfileDB'
``` bash
docker run -d --name mongodb -p 27017:27017 omerdeniz/mongodb:v1
```
    mongod:
    db.createUser({user: "user",pwd: "root", roles: ["readWrite","dbAdmin"]})

## Docker

``` bash
docker run --name microservice-redis -p 6379:6379 -d redis
```

``` bash
docker run --name redis-gui -d -p 8001:8001 redislabs/redisinsight:1.14.0
```
## Dockerfile image
    1- For local
```` bash
docker build -t configserver:v01 .
````

    2- For docker hub
```` bash
docker build -t omerdeniz/learnconfigserver:v01 .
docker build -t omerdeniz/learnauthserver:v01 .
docker build -t omerdeniz/learnuserserver:v01 .
````

    3- For M chip macOS user
```` bash
docker build --platform linux/amd64 -t omerdeniz/configserver:v01 .
````


