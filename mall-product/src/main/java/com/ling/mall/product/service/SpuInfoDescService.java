package com.ling.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ling.common.utils.PageUtils;
import com.ling.mall.product.entity.SpuInfoDescEntity;

import java.util.Map;

/**
 * spu信息介绍
 *
 * @author Ling
 * @date 2022-04-25
 */
public interface SpuInfoDescService extends IService<SpuInfoDescEntity> {

    PageUtils queryPage(Map<String, Object> params);

    void saveSpuInfoDesc(SpuInfoDescEntity spuInfoDescEntity);
}

