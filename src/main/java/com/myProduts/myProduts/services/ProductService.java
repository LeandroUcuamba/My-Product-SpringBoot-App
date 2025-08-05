package com.myProduts.myProduts.services;

import com.myProduts.myProduts.models.ProductModel;

import java.util.List;

public interface ProductService {
    List<ProductModel> getAllProducts();

    ProductModel saveProduct(ProductModel dataRequestProducts);
}
