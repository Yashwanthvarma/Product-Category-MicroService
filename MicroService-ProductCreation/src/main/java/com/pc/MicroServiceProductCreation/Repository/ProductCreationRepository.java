package com.pc.MicroServiceProductCreation.Repository;

import com.pc.MicroServiceProductCreation.Entity.ProductCreationEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductCreationRepository extends JpaRepository<ProductCreationEntity,String> {
}
