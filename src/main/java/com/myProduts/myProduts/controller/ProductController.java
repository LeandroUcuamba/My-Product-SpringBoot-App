package com.myProduts.myProduts.controller;

import com.myProduts.myProduts.models.ProductModel;
import com.myProduts.myProduts.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping
    public List<ProductModel> getAllProduct(){
        return productService.getAllProducts();
    }

    @PostMapping
    public ResponseEntity<ProductModel> saveProduct(@RequestBody ProductModel dataRequestProducts){
        ProductModel productSaved = productService.saveProduct(dataRequestProducts);
        return ResponseEntity.status(HttpStatus.CREATED).body(productSaved);
    }

}
