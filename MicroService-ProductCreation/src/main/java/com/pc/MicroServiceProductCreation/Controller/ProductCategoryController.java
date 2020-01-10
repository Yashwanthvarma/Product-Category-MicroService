package com.pc.MicroServiceProductCreation.Controller;


import com.pc.MicroServiceProductCreation.Dto.ProductCategoryDto;
import com.pc.MicroServiceProductCreation.Entity.ProductCategoryEntity;
import com.pc.MicroServiceProductCreation.Service.ProductCategoryService;
import com.pc.MicroServiceProductCreation.Utils.BaseResponse;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductCategoryController {

    @Autowired
    ProductCategoryService productCategoryService;


    @RequestMapping(value = "/addCategory", method = RequestMethod.POST)
    public BaseResponse addCategory (ProductCategoryDto productCategoryDto) {
        ProductCategoryEntity productCategoryEntity = new ProductCategoryEntity();
        BeanUtils.copyProperties(productCategoryDto,productCategoryEntity);
        BaseResponse response = productCategoryService.addNewCategory(productCategoryEntity);
        return response;
    }

    @RequestMapping(value = "/updateCategory", method = RequestMethod.PUT)
    public BaseResponse updateCategory (ProductCategoryDto productCategoryDto) {
        ProductCategoryEntity productCategoryEntity = new ProductCategoryEntity();
        BeanUtils.copyProperties(productCategoryDto,productCategoryEntity);
        BaseResponse response = productCategoryService.updateCategory(productCategoryEntity);
        return response;
    }

    @RequestMapping(value = "/deleteCategory/{categoryId}", method = RequestMethod.DELETE)
    public BaseResponse deleteCategory (String categoryId) {
        BaseResponse response = productCategoryService.deleteCategory(categoryId);
        return response;
    }

    @RequestMapping(value = "/getCategoryDetails/{categoryId}", method = RequestMethod.GET)
    public BaseResponse getCategoryDetails (String categoryId) {
        BaseResponse response = productCategoryService.getCategoryDetails(categoryId);
        return response;
    }

    @RequestMapping(value = "/getParentCategoryDetails/{categoryId}", method = RequestMethod.GET)
    public BaseResponse getParentCategoryDetails (String categoryId) {
        BaseResponse response = productCategoryService.getParentCategoryDetails(categoryId);
        return response;
    }

    @RequestMapping(value = "/getChildCategories/{parentCategoryId}", method = RequestMethod.GET)
    public BaseResponse getAllChildCategories (String parentCategoryId) {
        BaseResponse response = productCategoryService.getAllChildCategories(parentCategoryId);
        return response;
    }
}
