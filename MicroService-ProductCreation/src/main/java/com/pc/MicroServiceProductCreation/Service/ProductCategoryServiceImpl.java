package com.pc.MicroServiceProductCreation.Service;

import com.pc.MicroServiceProductCreation.Dto.ProductCategoryDto;
import com.pc.MicroServiceProductCreation.Entity.ProductCategoryEntity;
import com.pc.MicroServiceProductCreation.Repository.ProductCategoryRepository;
import com.pc.MicroServiceProductCreation.Utils.BaseResponse;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ControllerAdvice;

import java.util.List;


@Service
@ControllerAdvice
public class ProductCategoryServiceImpl implements ProductCategoryService {

    @Autowired
    private ProductCategoryRepository productCategoryRepository;

    @Override
    public BaseResponse getParentCategoryDetails(String categoryId) {
        return null;
    }

    @Override
    public BaseResponse getAllChildCategories(String categoryId) {
        BaseResponse response;
        ProductCategoryEntity parentCatData = productCategoryRepository.findByCategoryId(categoryId);
        List<ProductCategoryEntity> childCategories  = productCategoryRepository.findByParentCategory(parentCatData.getCategoryCode());
        response = new BaseResponse(childCategories, "", true, HttpStatus.OK);
        return response;
    }


    @Override
    public BaseResponse addNewCategory(ProductCategoryEntity productCategoryEntity) {
        BaseResponse response;
        productCategoryRepository.save(productCategoryEntity);
        response = new BaseResponse("category created successfully","",true);
        return response;
    }

    @Override
    public BaseResponse deleteCategory(String categoryId) {
        BaseResponse response;
        productCategoryRepository.deleteById(categoryId);
        response = new BaseResponse("selected category deleted successfully","",true);
        return response;
    }

    @Override
    public BaseResponse updateCategory(ProductCategoryEntity productCategoryEntity) {
        BaseResponse response;
        productCategoryRepository.save(productCategoryEntity);
        response = new BaseResponse("category data updated successfully","",true);
        return response;
    }

    @Override
    public BaseResponse getCategoryDetails(String categoryId) {
        BaseResponse<ProductCategoryDto> response;
        ProductCategoryEntity value;
        ProductCategoryDto productCategoryDto;
        value = productCategoryRepository.findByCategoryId(categoryId);
        try {
            ProductCategoryEntity productCategoryEntity = value;
            productCategoryDto = new ProductCategoryDto();
            BeanUtils.copyProperties(productCategoryEntity,productCategoryDto);
            response = new BaseResponse<>(productCategoryDto,"",true);
        } catch (IllegalArgumentException iae) {
            return new BaseResponse<>("no category found with the given id", iae.getMessage(),true, HttpStatus.OK);
        }
        return response;
    }
}
