# CRUD Products API with Java and Spring Boot
This project is a RESTful API for managing products, built with Java 17, Spring Boot 3, and PostgreSQL. The API allows you to create, read, update, and delete products.

### How to Run?
1. Open the project in your IDE (recommended: IntelliJ IDEA).

2. Download the dependencies:
Maven will handle this automatically once the project is loaded.

3. Configure your database:

- Open the application.yml file
- Replace the PostgreSQL credentials with your local setup

4. Run the application:

- Execute the MyProductsApplication main class.
- The API will be available at: http://localhost:8080

### Requirements:

 . Java 17
 . PostgreSQL
 . Maven


### API Features
Base URL: http://localhost:8080

#### saveProduct -> POST /products
 ### REQUEST
```
{
	"name": "Galaxy s21",
	"description": "console muito bom para utilizar",
	"productType": "Electronics"
}
```
### RESPONSE 201 - CREATED
```
{
   "productId": "3ebcdc11-d9f2-4ddd-8b41-7b327bd6b294",
   "name": "Galaxy s21",
   "description": "console muito bom para utilizar",
   "productType": "Electronics",
   "creationDate": "2023-09-24T12:16:09Z",
   "lastUpdateDate": "2023-09-24T12:16:09Z"
}
```
#### getAllProducts -> GET /products
### RESPONSE 200 OK
```
[
   {
      "productId": "3ebcdc11-d9f2-4ddd-8b41-7b327bd6b294",
      "name": "Galaxy s21",
      "description": "console muito bom para utilizar",
      "productType": "Electronics",
      "creationDate": "2023-09-24T12:16:09Z",
      "lastUpdateDate": "2023-09-24T12:16:09Z"
   },
   {
      "productId": "c5e943d9-d2c1-498a-8bcb-bc3f73557f01",
      "name": "PC Gamer",
      "description": "Gamer muito bom para utilizar",
      "productType": "Electronics",
      "creationDate": "2023-09-24T12:29:39Z",
      "lastUpdateDate": "2023-09-24T12:29:39Z"
   }
]
```
#### getOneProduct -> GET /products/c5e943d9-d2c1-498a-8bcb-bc3f73557f01
  ### RESPONSE 200 OK
```
{
   "productId": "c5e943d9-d2c1-498a-8bcb-bc3f73557f01",
   "name": "PC Gamer",
   "description": "Gamer muito bom para utilizar",
   "productType": "Electronics",
   "creationDate": "2023-09-24T12:29:39Z",
   "lastUpdateDate": "2023-09-24T12:29:39Z"
}
```

#### update -> PUT /products/c5e943d9-d2c1-498a-8bcb-bc3f73557f01
  RESPONSE 200 OK
```
{
   "productId": "c5e943d9-d2c1-498a-8bcb-bc3f73557f01",
   "name": "Console",
   "description": "Console editado",
   "productType": "Electronics",
   "creationDate": "2023-09-24T12:29:39Z",
   "lastUpdateDate": "2023-09-24T12:29:39Z"
}
```

#### delete -> DELETE /products/c5e943d9-d2c1-498a-8bcb-bc3f73557f01
  RESPONSE 204 - NO CONTENT
```
```

## Stacks
- Java 17
- Spring Boot 3
- Spring Data JPA
- PostgreSQL
- Maven

# Tools
- macOS
- IntelliJ IDE
- Postman

Developed by [Leandro Ucuamba](https://www.linkedin.com/in/leandrosantosucuamba/)
