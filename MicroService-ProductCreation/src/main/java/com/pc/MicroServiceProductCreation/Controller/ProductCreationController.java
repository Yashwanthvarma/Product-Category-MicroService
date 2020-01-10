//package com.pc.MicroServiceProductCreation.Controller;
//
//
//import com.pc.MicroServiceProductCreation.Dto.ProductCreationDto;
//import com.pc.MicroServiceProductCreation.Service.ProductCreationService;
//import com.pc.MicroServiceProductCreation.Utils.BaseResponse;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//public class ProductCreationController {
//
//    @Autowired
//    ProductCreationService productCreationService;
//
//
//    @RequestMapping(value = "/createNewProduct", method = RequestMethod.POST)
//    public BaseResponse createNewProduct (@RequestBody ProductCreationDto productCreationDto) {
//        return null;
//    }
//
//    @RequestMapping(value = "/updateProduct}", method = RequestMethod.PUT)
//    public BaseResponse updateProductDetails (@RequestBody ProductCreationDto productCreationDto)  {
//        return  null;
//    }
//
//    @RequestMapping(value = "/deleteProduct/{productId}", method = RequestMethod.DELETE)
//    public BaseResponse deleteProduct (@RequestBody String productId) {
//        return null;
//    }
//
//    @RequestMapping(value = "/getProductDetails/{productId}", method = RequestMethod.GET)
//    public BaseResponse getProductDetails (@RequestBody String productId)  {
//        return null;
//    }
//}
