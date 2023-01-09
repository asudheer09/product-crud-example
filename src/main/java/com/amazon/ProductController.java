package com.amazon;

import com.amazon.entity.Product;
import com.amazon.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/display")
    public List<Product> displayProducts(){
       return productService.displayAllProducts();
    }

}
