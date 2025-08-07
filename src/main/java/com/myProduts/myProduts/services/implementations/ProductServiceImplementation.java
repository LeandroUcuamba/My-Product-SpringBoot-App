package com.myProduts.myProduts.services.implementations;

import com.myProduts.myProduts.models.ProductModel;
import com.myProduts.myProduts.repositories.ProductRepository;
import com.myProduts.myProduts.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class ProductServiceImplementation implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public ProductModel saveProduct(ProductModel dataRequestProducts) {
        return productRepository.save(dataRequestProducts);
    }

    @Override
    public List<ProductModel> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Optional<ProductModel> getOneProduct(UUID productId) {
        return productRepository.findById(productId);
    }

    @Override
    public void deleteProduct(UUID productId) {
        productRepository.deleteById(productId);
    }

}
