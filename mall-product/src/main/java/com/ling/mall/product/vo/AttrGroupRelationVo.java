package com.ling.mall.product.vo;

import lombok.Data;

/**
 * @Description:
 * @Created: with IntelliJ IDEA.
 * @author Ling
 * @date 2022-04-27
 **/

@Data
public class AttrGroupRelationVo {

    //[{"attrId":1,"attrGroupId":2}]
    private Long attrId;

    private Long attrGroupId;

}
