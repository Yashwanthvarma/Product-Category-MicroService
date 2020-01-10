package com.pc.MicroServiceProductCreation.Dto;

public class ProductCreationDto {
    private String productId;
    private String productCode;
    private String productName;
    private String brandName;
    private Object category;
    private String description;
    private Object specifications;
    private Object variants;

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public Object getCategory() {
        return category;
    }

    public void setCategory(Object category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Object getSpecifications() {
        return specifications;
    }

    public void setSpecifications(Object specifications) {
        this.specifications = specifications;
    }

    public Object getVariants() {
        return variants;
    }

    public void setVariants(Object variants) {
        this.variants = variants;
    }
}
