package com.ling.mall.order.vo;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @Description:
 * @Created: with IntelliJ IDEA.
 * @author Ling
 * @date 2022-06-17
 **/

@Data
public class FareVo {

    private MemberAddressVo address;

    private BigDecimal fare;

}
