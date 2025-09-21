package com.example.demo.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    

    @Autowired //이걸로 의존성 주입
    private ProductRepository productRepository;

    @Autowired
    ProductService(ProductRepository productRepository){
        this.productRepository = productRepository;
    }

    public String findProduct(int id){
        return productRepository.findProduct(id);
    }

    public void saveProduct(String productName){
        productRepository.save(productName);
    }

}
