package com.myProduts.myProduts.controller;

import com.myProduts.myProduts.Exception.ErrorMessageException;
import com.myProduts.myProduts.models.ProductModel;
import com.myProduts.myProduts.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping
    public ResponseEntity<ProductModel> saveProduct(@RequestBody ProductModel dataRequestProducts){
        ProductModel productSaved = productService.saveProduct(dataRequestProducts);
        return ResponseEntity.status(HttpStatus.CREATED).body(productSaved);
    }

    @GetMapping
    public List<ProductModel> getAllProduct(){
        return productService.getAllProducts();
    }

    @GetMapping("/{productId}")
    public ResponseEntity<Object> getOneProduct(@PathVariable(value = "productId")UUID productId){
        Optional<ProductModel> product = productService.getOneProduct(productId);

        ErrorMessageException errorMessage = new ErrorMessageException("Product not found");

        if(product.isPresent()){
            return ResponseEntity.status(HttpStatus.OK).body(product);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(errorMessage);
        }

    }

}
