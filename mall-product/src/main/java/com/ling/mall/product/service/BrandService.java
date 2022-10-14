package com.ling.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ling.common.utils.PageUtils;
import com.ling.mall.product.entity.BrandEntity;

import java.util.Map;

/**
 * 品牌
 *
 * @author Ling
 * @date 2022-04-25
 */
public interface BrandService extends IService<BrandEntity> {

    PageUtils queryPage(Map<String, Object> params);

    void updateDetail(BrandEntity brand);
}

