package com.juhan.service;


import com.juhan.domain.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    ProductClientFeign productClientFeign;

    public List<Product> listProducts() {
        return productClientFeign.listProdcuts();

    }
}