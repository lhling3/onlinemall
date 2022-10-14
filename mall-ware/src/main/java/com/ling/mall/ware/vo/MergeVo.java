package com.ling.mall.ware.vo;

import lombok.Data;

import java.util.List;

/**
 * @Description:
 * @Created: with IntelliJ IDEA.
 * @author Ling
 * @date 2022-06-18
 **/

@Data
public class MergeVo {

    private Long purchaseId;

    private List<Long> items;

}
