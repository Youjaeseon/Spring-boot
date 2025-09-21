package com.example.demo.product;

import org.springframework.stereotype.Repository;

import java.util.Map;
import java.util.HashMap;

@Repository
public class ProductRepository {

  private Map<Integer, String> db =new HashMap<>();
  private int id = 1;
 
  public String findProduct(int idx){
    return db.get(idx);
  }

  public void save(Product product){
   System.out.println(product.getName());

    // db.put(id++,productName);
  }

}
