package com.sidewipe.mapper;

import com.sidewipe.entity.OrderInfo;


public interface OrderInfoMapper {

    OrderInfo selectOrderInfoById(String orderNo);
}
