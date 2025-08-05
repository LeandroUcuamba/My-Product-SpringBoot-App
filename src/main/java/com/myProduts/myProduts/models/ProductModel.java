package com.myProduts.myProduts.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.myProduts.myProduts.enums.ProductType;
import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.UUID;

@Table(name = "TB_PRODUCTS")
@Entity
public class ProductModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID productId;

    @Column(nullable = false, length = 50, unique = true)
    private String name;

    @Column(nullable = false, length = 150)
    private String description;

    @Enumerated(EnumType.STRING)
    private ProductType productType;

    @Column(nullable = false)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'")
    private LocalDateTime creationDate;

    @Column(nullable = false)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'")
    private LocalDateTime lastUpdateDate;

    @PrePersist
    protected void onCreate() {
        this.creationDate = LocalDateTime.now();
        this.lastUpdateDate = LocalDateTime.now();
    }

    @PreUpdate
    protected void onUpdate() {
        this.lastUpdateDate = LocalDateTime.now();
    }

    public ProductModel() {
    }

    public ProductModel(UUID productId, String name, String description, ProductType productType, LocalDateTime creationDate, LocalDateTime lastUpdateDate) {
        this.productId = productId;
        this.name = name;
        this.description = description;
        this.productType = productType;
        this.creationDate = creationDate;
        this.lastUpdateDate = lastUpdateDate;
    }
    
    public UUID getProductId() {
        return productId;
    }

    public void setProductId(UUID productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ProductType getProductType() {
        return productType;
    }

    public void setProductType(ProductType productType) {
        this.productType = productType;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDateTime creationDate) {
        this.creationDate = creationDate;
    }

    public LocalDateTime getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(LocalDateTime lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }
}
