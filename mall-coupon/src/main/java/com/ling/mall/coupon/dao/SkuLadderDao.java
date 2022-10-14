package com.ling.mall.coupon.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ling.mall.coupon.entity.SkuLadderEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品阶梯价格
 * @author Ling
 * @date 2022-05-29
 */
@Mapper
public interface SkuLadderDao extends BaseMapper<SkuLadderEntity> {
	
}
