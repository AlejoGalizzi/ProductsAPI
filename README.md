
# ProductsAPI
This is an API to create, read, update and delete products.

Apart from the typical endpoints, such as: 

 - GET http://localhost:8080/products : To get all products.
 - GET http://localhost:8080/products/1 : To get an especific product.
 - POST http://localhost:8080/products : To create a new product.
 - PUT http://localhost:8080/products/1 : To update an existing product.
 - DELETE http://localhost:8080/products/1 : To delete an existing product.

You have other endpoint to get a product searching by name and also to get all products ordered by price: 

 - GET http://localhost:8080/products?orderByPrice=true : To get all products ordered by price (ASC).
 - GET http://localhost:8080/products?name=Product : To get a product search by name.

These version doesn't have any restrictions apart from the unique constraint for name of the product.

Above you have a JSON to use in Postman. Just import the following JSON and use the endpoints mentioned before.

    {
	"info": {
		"_postman_id": "7a02bdc7-58ca-4158-a01b-6edac6e4e0d9",
		"name": "ProductsAPI",
		"schema": "https://schema.getpostman.com/json/collection/v2.0.0/collection.json",
		"_exporter_id": "15179256",
		"_collection_link": "https://winter-star-979695.postman.co/workspace/AlejoGalizzi~42965b20-0988-4681-a581-7873de9fa7e9/collection/15179256-7a02bdc7-58ca-4158-a01b-6edac6e4e0d9?action=share&creator=15179256&source=collection_link"
	},
	"item": [
		{
			"name": "GetProductsOrderByPrice",
			"request": {
				"method": "GET",
				"header": [],
				"url": {
					"raw": "localhost:8080/products?orderByPrice=true",
					"host": [
						"localhost"
					],
					"port": "8080",
					"path": [
						"products"
					],
					"query": [
						{
							"key": "orderByPrice",
							"value": "true"
						}
					]
				}
			},
			"response": []
		},
		{
			"name": "GetProducts",
			"request": {
				"method": "GET",
				"header": [],
				"url": "localhost:8080/products"
			},
			"response": []
		},
		{
			"name": "GetProductById",
			"request": {
				"method": "GET",
				"header": [],
				"url": "localhost:8080/products/1"
			},
			"response": []
		},
		{
			"name": "CreateProduct",
			"request": {
				"method": "POST",
				"header": [],
				"body": {
					"mode": "raw",
					"raw": "{\r\n    \"name\": \"new Product\",\r\n    \"description\": \"This is a new product.\",\r\n    \"price\": 10.0,\r\n    \"quantity\": 4\r\n}",
					"options": {
						"raw": {
							"language": "json"
						}
					}
				},
				"url": "localhost:8080/products"
			},
			"response": []
		},
		{
			"name": "UpdateProduct",
			"request": {
				"method": "PUT",
				"header": [],
				"body": {
					"mode": "raw",
					"raw": "{\r\n    \"name\": \"Product updated\",\r\n    \"description\": \"This is a product updated.\",\r\n    \"price\": 30.0,\r\n    \"quantity\": 7\r\n}",
					"options": {
						"raw": {
							"language": "json"
						}
					}
				},
				"url": "localhost:8080/products/4"
			},
			"response": []
		},
		{
			"name": "DeleteProduct",
			"request": {
				"method": "DELETE",
				"header": [],
				"url": "localhost:8080/products/5"
			},
			"response": []
		},
		{
			"name": "New Request",
			"request": {
				"method": "GET",
				"header": []
			},
			"response": []
		}
	]
	}
