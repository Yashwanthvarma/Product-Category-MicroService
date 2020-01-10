package com.pc.MicroServiceProductCreation.Service;

import com.pc.MicroServiceProductCreation.Entity.ProductCategoryEntity;
import com.pc.MicroServiceProductCreation.Utils.BaseResponse;

public interface ProductCategoryService {

    public BaseResponse addNewCategory (ProductCategoryEntity productCategoryEntity);

    public BaseResponse deleteCategory (String categoryId);

    public BaseResponse updateCategory (ProductCategoryEntity productCategoryEntity);

    public BaseResponse getCategoryDetails (String categoryId);

    public BaseResponse getParentCategoryDetails (String categoryId);

    public BaseResponse getAllChildCategories (String categoryId);

}
