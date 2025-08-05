package com.myProduts.myProduts.services.implementations;

import com.myProduts.myProduts.models.ProductModel;
import com.myProduts.myProduts.repositories.ProductRepository;
import com.myProduts.myProduts.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImplementation implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<ProductModel> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public ProductModel saveProduct(ProductModel dataRequestProducts) {
        return productRepository.save(dataRequestProducts);
    }

}
