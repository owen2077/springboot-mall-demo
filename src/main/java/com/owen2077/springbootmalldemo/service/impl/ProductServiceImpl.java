package com.owen2077.springbootmalldemo.service.impl;

import com.owen2077.springbootmalldemo.dao.ProductDao;
import com.owen2077.springbootmalldemo.model.Product;
import com.owen2077.springbootmalldemo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao productDao;

    @Override
    public Product getProductById(Integer productId) {
        return productDao.getProductById(productId);
    }
}
