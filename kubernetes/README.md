# Deployment on Kubernetes

To deployment usgin kubernetes:

0. Create pvc/pv:

`kubectl apply -f mysql-storage.yml`


1. Create deployment database mysql, on directory config_db execute:
  
`kubectl apply -f deploy-bd.yml`

OBS.

* Mysql pod requirements root_path or pvc for this example!!! 
* root password mysql not plain, should be used base64, for example:

`echo -n "12345678" | base64`


2. Copy *script.sql* on path */mnt/data*, this path change for use.

3. On pod mysql, restore database:

`kubectl exec -it pod/name -- bash`

`mysql -u root -p < script.sql` 

4. Execute service applicaton:

`kubectl apply -f service-app.yml`


5. Create pod for application springboot:

`kubectl apply -d deploy-app.yml`
