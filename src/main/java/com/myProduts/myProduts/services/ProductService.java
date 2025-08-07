package com.myProduts.myProduts.services;

import com.myProduts.myProduts.models.ProductModel;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface ProductService {

    ProductModel saveProduct(ProductModel dataRequestProducts);

    List<ProductModel> getAllProducts();

    Optional<ProductModel> getOneProduct(UUID productId);

    void deleteProduct(UUID productId);
}
