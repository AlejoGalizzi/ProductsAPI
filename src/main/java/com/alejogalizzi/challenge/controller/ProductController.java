package com.alejogalizzi.challenge.controller;

import com.alejogalizzi.challenge.model.Product;
import com.alejogalizzi.challenge.service.abstraction.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/products")
@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping
    private ResponseEntity<List<Product>> getProducts() {
        return ResponseEntity.ok(productService.getProducts());
    }

    @GetMapping
    private ResponseEntity<List<Product>> getProducts(@RequestParam(name = "orderByPrice") boolean order) {
        if(order){
            return ResponseEntity.ok(productService.getProductsOrderByPrice());
        }
        return ResponseEntity.ok(productService.getProducts());
    }

    @GetMapping("/{id}")
    private ResponseEntity<Product> getProductById(@PathVariable long id) {
        return ResponseEntity.ok(productService.getProductById(id));
    }

    @GetMapping
    private ResponseEntity<Product> getProductByName(@RequestParam String name) {
        return ResponseEntity.ok(productService.getProductByName(name));
    }

    @PostMapping
    private ResponseEntity<Product> createProduct(@RequestBody Product product) {
        return new ResponseEntity<Product>(productService.createProduct(product), HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    private ResponseEntity<Product> updateProduct(@PathVariable long id,@RequestBody Product product) {
        return new ResponseEntity<Product>(productService.updateProduct(id, product), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    private ResponseEntity<Void> deleteProduct(@PathVariable long id) {
        productService.deleteProduct(id);
        return ResponseEntity.noContent().build();
    }
}
