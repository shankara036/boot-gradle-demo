package com.boot.demo.bootstrap;

import com.boot.demo.domains.Product;
import com.boot.demo.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.HashMap;

@Component
public class SpringJPABootstrap implements ApplicationListener<ContextRefreshedEvent> {

    private ProductService productService;

    @Autowired
    public void setProductService(ProductService productService) {
        this.productService = productService;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        loadProducts();
    }

    public void loadProducts() {
        Product p1 = new Product();
        p1.setProductName("Samsung S8");
        p1.setProductDesc("Smart Phone");
        p1.setProductPrice(new BigDecimal("1000.9"));
        p1.setProductImageUrl("http://exmaple.com/product1");
        productService.saveOrUpdate(p1);

        Product p2 = new Product();
        p2.setProductName("Apple Iphone11");
        p2.setProductDesc("Smart Phone");
        p2.setProductPrice(new BigDecimal("1000.9"));
        p2.setProductImageUrl("http://exmaple.com/product2");
        productService.saveOrUpdate(p2);

        Product p3 = new Product();
        p3.setProductName("OnePlus 6T");
        p3.setProductDesc("Smart Phone");
        p3.setProductPrice(new BigDecimal("1000.9"));
        p3.setProductImageUrl("http://exmaple.com/product3");
        productService.saveOrUpdate(p3);

        Product p4 = new Product();
        p4.setProductName("Xiomi Note 7 Pro");
        p4.setProductDesc("Smart Phone");
        p4.setProductPrice(new BigDecimal("1000.9"));
        p4.setProductImageUrl("http://exmaple.com/product4");
        productService.saveOrUpdate(p4);

        Product p5 = new Product();
        p5.setProductName("Honor 8X");
        p5.setProductDesc("Smart Phone");
        p5.setProductPrice(new BigDecimal("1000.9"));
        p5.setProductImageUrl("http://exmaple.com/product5");
        productService.saveOrUpdate(p5);
    }
}
