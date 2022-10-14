package com.ling.mall.ware.vo;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @Description:
 * @Created: with IntelliJ IDEA.
 * @author Ling
 * @date 2022-06-18
 **/

@Data
public class FareVo {

    private MemberAddressVo address;

    private BigDecimal fare;

}


