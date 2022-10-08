# Repo Example Spring Rest Api with Database 
This simple application api rest with database (non insert)

`http://ip:5000/getStudent/id`


0.Create network docker
docker network create red1

1.Create database container mysql
docker run -dit -p 3306:3306 --network red1  --name mydb -e MYSQL_ROOT_PASSWORD=12345678 mysql:8

2.Create image docker
docker build -t {NAME_IMAGE} . 

3.Restore database
docker exec -i mydb sh -c 'exec mysql -uroot -p12345678 mydb' < script.sql

4.Create container
docker run -dit -p 5000:5000 --network red1  --name app img1

# Multibuild

on folder have Dockerfile with multistage
