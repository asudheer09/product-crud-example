package com.amazon.service;

import com.amazon.entity.Product;
import com.amazon.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    public void saveProduct(Product product){
        repository.save(product);
        System.out.println("product is saved successfully");
    }

    public void deleteProduct(Long productId){
        repository.deleteById(productId);
    }

    public void displayAllProducts(){
        List<Product> productList=repository.findAll();
        productList.forEach(System.out::println);
    }

    public void updateProduct(Long productId) throws Exception{
       Product existingProduct= repository.findById(productId)
               .orElseThrow(()-> new Exception("product not found in the database"));
        existingProduct.setProductName("something");
        repository.save(existingProduct);
    }


}
