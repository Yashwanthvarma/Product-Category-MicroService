package com.pc.MicroServiceProductCreation.Repository;

import com.pc.MicroServiceProductCreation.Entity.ProductCategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductCategoryRepository extends JpaRepository<ProductCategoryEntity,String> {
    public ProductCategoryEntity findByCategoryId(String category_id);

    public List<ProductCategoryEntity> findByParentCategory(String category_code);
}
