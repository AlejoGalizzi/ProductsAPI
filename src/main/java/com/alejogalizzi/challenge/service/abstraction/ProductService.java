package com.alejogalizzi.challenge.service.abstraction;

import com.alejogalizzi.challenge.model.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProductService {

    List<Product> getProducts();

    Product getProductById(long id);

    Product getProductByName(String name);

    Product createProduct(Product product);

    Product updateProduct(long id, Product product);

    void deleteProduct(long id);
}
