package com.amazon;

import com.amazon.entity.Product;
import com.amazon.service.ProductService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ProductCrudExampleApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext context=SpringApplication.run(ProductCrudExampleApplication.class, args);
		ProductService productService=context.getBean(ProductService.class);

		/*Product product= new Product();
		product.setProductId(113L);
		product.setProductName("Ipad");
		product.setPrice(25000);
		productService.saveProduct(product);

		productService.displayAllProducts();*/

		try {
			productService.updateProduct(113L);
		}catch(Exception e){
			e.printStackTrace();
		}




	}

}
