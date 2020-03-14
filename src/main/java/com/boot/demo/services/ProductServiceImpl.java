package com.boot.demo.services;

import com.boot.demo.domains.DomainObject;
import com.boot.demo.domains.Product;
import net.bytebuddy.implementation.bind.annotation.FieldProxy;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;

@Service
@Profile("domain-map")
public class ProductServiceImpl extends AbstractMapService implements ProductService {

    @Override
    public List<DomainObject> listAll() {
        return super.listAll();
    }

    @Override
    public Product getById(Integer id) {
        return (Product) super.getById(id);
    }

    @Override
    public Product saveOrUpdate(Product domainObject) {
        return (Product) super.saveOrUpdate(domainObject);
    }

    @Override
    public void delete(Integer id) {
        super.delete(id);
    }

    @Override
    protected void loadDomainObjects() {
        domainObjectMap = new HashMap<>();
        Product p1 = new Product();
        p1.setId(1);
        p1.setProductName("Samsung S8");
        p1.setProductDesc("Smart Phone");
        p1.setProductPrice(new BigDecimal("1000.9"));
        p1.setProductImageUrl("http://exmaple.com/product1");
        domainObjectMap.put(p1.getId(), p1);

        Product p2 = new Product();
        p2.setId(2);
        p2.setProductName("Apple Iphone11");
        p2.setProductDesc("Smart Phone");
        p2.setProductPrice(new BigDecimal("1000.9"));
        p2.setProductImageUrl("http://exmaple.com/product2");
        domainObjectMap.put(p2.getId(), p2);

        Product p3 = new Product();
        p3.setId(3);
        p3.setProductName("OnePlus 6T");
        p3.setProductDesc("Smart Phone");
        p3.setProductPrice(new BigDecimal("1000.9"));
        p3.setProductImageUrl("http://exmaple.com/product3");
        domainObjectMap.put(p3.getId(), p3);

        Product p4 = new Product();
        p4.setId(4);
        p4.setProductName("Xiomi Note 7 Pro");
        p4.setProductDesc("Smart Phone");
        p4.setProductPrice(new BigDecimal("1000.9"));
        p4.setProductImageUrl("http://exmaple.com/product4");
        domainObjectMap.put(p4.getId(), p4);

        Product p5 = new Product();
        p5.setId(5);
        p5.setProductName("Honor 8X");
        p5.setProductDesc("Smart Phone");
        p5.setProductPrice(new BigDecimal("1000.9"));
        p5.setProductImageUrl("http://exmaple.com/product5");
        domainObjectMap.put(p5.getId(), p5);
    }
}
