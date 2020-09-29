package com.sidewipe.controller;

import com.sidewipe.entity.OrderInfo;
import com.sidewipe.entity.ProductInfo;
import com.sidewipe.feignapi.sentinel.ProductCenterFeignApiWithSentinel;
import com.sidewipe.mapper.OrderInfoMapper;
import com.sidewipe.vo.OrderVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 *
 * //feign+sentinel基础用法
 */
@RestController
public class OrderInfoController {

    @Autowired
    private ProductCenterFeignApiWithSentinel productCenterFeignApiWithSentinel;

    @Autowired
    private OrderInfoMapper orderInfoMapper;

    @RequestMapping("/selectOrderInfoById/{orderNo}")
    public Object selectOrderInfoById(@PathVariable("orderNo") String orderNo) {

        OrderInfo orderInfo = orderInfoMapper.selectOrderInfoById(orderNo);
        if(null == orderInfo) {
            return "根据orderNo:"+orderNo+"查询没有该订单";
        }

        ProductInfo productInfo = productCenterFeignApiWithSentinel.selectProductInfoById(orderInfo.getProductNo());

        if(productInfo == null) {
            return "没有对应的商品";
        }

        OrderVo orderVo = new OrderVo();
        orderVo.setOrderNo(orderInfo.getOrderNo());
        orderVo.setUserName(orderInfo.getUserName());
        orderVo.setProductName(productInfo.getProductName());
        orderVo.setProductNum(orderInfo.getProductCount());

        return orderVo;
    }


}
