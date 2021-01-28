# Spring Boot MySQL

## Test the Application

Now that the application is running, you can test it by using curl or some similar tool. You have two HTTP endpoints that you can test:

 * `GET localhost:8080/demo/all`: Gets all data. 
 * `POST localhost:8080/demo/add`: Adds one user to the data.

The following curl command adds a user:

```bash
$ curl localhost:8080/demo/add -d name=First -d email=someemail@someemailprovider.com
```
The reply should be as follows:

`Saved`

The following command shows all the users:

```bash
$ curl 'localhost:8080/demo/all'
```

The reply should be as follows:

```console
[{"id":1,"name":"First","email":"someemail@someemailprovider.com"}]
```

