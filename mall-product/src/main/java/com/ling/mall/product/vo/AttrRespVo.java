package com.ling.mall.product.vo;

import lombok.Data;

/**
 * @Description:
 * @Created: with IntelliJ IDEA.
 * @author Ling
 * @date 2022-04-27
 **/

@Data
public class AttrRespVo extends AttrVo {

    /**
     *
     */
    private String catelogName;

    private String groupName;

    private Long[] catelogPath;

}
