package com.sidewipe.feignapi.productcenter;

import com.sidewipe.entity.ProductInfo;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * 通过java配置版本来指定细粒度配置
 * */

//@FeignClient(name = "product-center",configuration = ProductCenterFeignConfig.class)
//@FeignClient(name = "product-center")
public interface ProductCenterFeignApi {

    /**
     * 声明式接口,远程调用http://product-center/selectProductInfoById/{productNo}
     * @param productNo
     * @return
     **/

    @RequestMapping("/selectProductInfoById/{productNo}")
    ProductInfo selectProductInfoById(@PathVariable("productNo") String productNo);



    /**
     * 修改锲约为Feign的  那么就可以使用默认的注解
     * @param productNo
     * @return
     */
//    @RequestLine("GET /selectProductInfoById/{productNo}")
//    ProductInfo selectProductInfoById(@Param("productNo") String productNo);
//
//    @RequestLine("GET /getToken4Header")
//    String getToken4Header(@RequestHeader("token") String token);

}
