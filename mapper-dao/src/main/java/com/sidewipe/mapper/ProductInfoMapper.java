package com.sidewipe.mapper;

import com.sidewipe.entity.ProductInfo;


public interface ProductInfoMapper {

    ProductInfo selectProductInfoById(String productNo);
}
