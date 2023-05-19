package com.alejogalizzi.challenge.service;

import com.alejogalizzi.challenge.model.Product;
import com.alejogalizzi.challenge.repository.ProductRepository;
import com.alejogalizzi.challenge.service.abstraction.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImp implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<Product> getProducts() {
        return productRepository.findAll();
    }

    @Override
    public List<Product> getProductsOrderByPrice() {
        return productRepository.findAllByOrderByPrice();
    }

    @Override
    public Product getProductById(long id) {
        try {
            return productRepository.findById(id).orElseThrow(ClassNotFoundException::new);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Product getProductByName(String name) {
        Product productDB = productRepository.findByName(name).orElse(null);
        try {
            if(productDB != null){
                return productDB;
            }
            throw new ClassNotFoundException();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Product createProduct(Product product) {
        Product newProduct = new Product();
        newProduct.setName(product.getName());
        newProduct.setDescription(product.getDescription());
        newProduct.setPrice(product.getPrice());
        newProduct.setQuantity(product.getQuantity());
        return productRepository.save(newProduct);
    }

    @Override
    public Product updateProduct(long id, Product product) {
        Product productDB = productRepository.findById(id).orElse(null);
        if(productDB != null) {
            productDB.setName(product.getName());
            productDB.setQuantity(product.getQuantity());
            productDB.setPrice(product.getPrice());
            productDB.setDescription(product.getDescription());
        }else {
            return null;
        }
        return productRepository.save(productDB);
    }

    @Override
    public void deleteProduct(long id) {
        if(productRepository.existsById(id)) {
            productRepository.deleteById(id);
        }
    }
}
