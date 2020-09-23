package com.sidewipe.handler;

import com.alibaba.csp.sentinel.slots.block.flow.FlowException;
import com.sidewipe.entity.ProductInfo;
import com.sidewipe.feignapi.sentinel.ProductCenterFeignApiWithSentinel;
import feign.hystrix.FallbackFactory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class ProductCenterFeignApiWithSentielFallbackFactory implements FallbackFactory<ProductCenterFeignApiWithSentinel> {
    @Override
    public ProductCenterFeignApiWithSentinel create(Throwable throwable) {
        return new ProductCenterFeignApiWithSentinel(){


            @Override
            public ProductInfo selectProductInfoById(String productNo) {
                ProductInfo productInfo = new ProductInfo();
                if (throwable instanceof FlowException){
                    productInfo.setProductName("我是限流的默认商品");
                }
                else {
                    productInfo.setProductName("我是降级的默认商品");

                }
                return productInfo;
            }
        };
    }
}
