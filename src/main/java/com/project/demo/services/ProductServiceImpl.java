package com.project.demo.services;

import com.project.demo.models.Product;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Service
public class ProductServiceImpl implements ProductService {
    private static Map<String, Product> productRepo = new HashMap<>();
    static {
        Product honey = new Product();
        honey.setId("1");
        honey.setName("Honey");
        productRepo.put(honey.getId(), honey);

        Product almond = new Product();
        almond.setId("2");
        almond.setName("Almond");
        productRepo.put(almond.getId(), almond);
    }
    @Override
    public void createProduct(Product product) {
        productRepo.put(product.getId(), product);
    }
    @Override
    public void updateProduct(String id, Product product) {
        productRepo.remove(id);
        product.setId(id);
        productRepo.put(id, product);
    }
    @Override
    public void deleteProduct(String id) {
        productRepo.remove(id);

    }
    @Override
    public Collection<Product> getProducts() {
        return productRepo.values();
    }
}