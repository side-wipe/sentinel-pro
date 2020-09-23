package com.sidewipe.handler;

import com.sidewipe.entity.ProductInfo;
import com.sidewipe.feignapi.sentinel.ProductCenterFeignApiWithSentinel;

import org.springframework.stereotype.Component;


@Component
public class ProductCenterFeignApiWithSentinelFallback implements ProductCenterFeignApiWithSentinel {
    @Override
    public ProductInfo selectProductInfoById(String productNo) {
        ProductInfo productInfo = new ProductInfo();
        productInfo.setProductName("默认商品");
        return productInfo;
    }
}
