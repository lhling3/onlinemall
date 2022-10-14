package com.ling.mall.product.vo;

import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
 * @Description:
 * @Created: with IntelliJ IDEA.
 * @author Ling
 * @date 2022-04-27
 **/

@Data
@ToString
public class SpuItemAttrGroupVo {

    private String groupName;

    private List<Attr> attrs;

}
