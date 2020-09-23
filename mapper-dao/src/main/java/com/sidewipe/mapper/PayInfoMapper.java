package com.sidewipe.mapper;

import com.sidewipe.entity.PayInfo;


public interface PayInfoMapper {

    PayInfo selectPayInfoByOrderNo(String orderNo);
}
