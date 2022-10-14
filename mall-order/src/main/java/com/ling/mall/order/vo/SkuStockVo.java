package com.ling.mall.order.vo;

import lombok.Data;

/**
 * @Description: 库存vo
 * @Created: with IntelliJ IDEA.
 * @author Ling
 * @date 2022-06-18
 **/

@Data
public class SkuStockVo {


    private Long skuId;

    private Boolean hasStock;

}
