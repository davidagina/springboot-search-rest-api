package com.daveproject.springboot.service;

import com.daveproject.springboot.entity.Product;

import java.util.List;

public interface ProductService {

    List<Product> searchProducts(String query);

    Product createProduct(Product product);

}
