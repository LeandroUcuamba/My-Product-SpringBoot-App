package com.myProduts.myProduts.repositories;

import com.myProduts.myProduts.models.ProductModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ProductRepository extends JpaRepository<ProductModel, UUID> {
}
