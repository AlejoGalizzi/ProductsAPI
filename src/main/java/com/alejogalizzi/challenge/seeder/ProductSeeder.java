package com.alejogalizzi.challenge.seeder;

import com.alejogalizzi.challenge.model.Product;
import com.alejogalizzi.challenge.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProductSeeder implements CommandLineRunner {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public void run(String... args) throws Exception {
        productRepository.saveAll(instantiateProduct());
    }

    private List<Product> instantiateProduct() {
        Product product1 = new Product();
        product1.setName("Product 1");
        product1.setDescription("Description for Product 1");
        product1.setPrice(20.0);
        product1.setQuantity(5);

        Product product2 = new Product();
        product2.setName("Product 2");
        product2.setDescription("Description for Product 2");
        product2.setPrice(10.0);
        product2.setQuantity(3);

        Product product3 = new Product();
        product3.setName("Product 3");
        product3.setDescription("Description for Product 3");
        product3.setPrice(5.0);
        product3.setQuantity(8);

        Product product4 = new Product();
        product4.setName("Product 4");
        product4.setDescription("Description for Product 4");
        product4.setPrice(12.5);
        product4.setQuantity(2);

        Product product5 = new Product();
        product5.setName("Product 5");
        product5.setDescription("Description for Product 5");
        product5.setPrice(10.75);
        product5.setQuantity(6);

        Product product6 = new Product();
        product6.setName("Product 6");
        product6.setDescription("Description for Product 6");
        product6.setPrice(22.5);
        product6.setQuantity(4);

        return List.of(product1, product2, product3, product4, product5, product6);
    }
}
