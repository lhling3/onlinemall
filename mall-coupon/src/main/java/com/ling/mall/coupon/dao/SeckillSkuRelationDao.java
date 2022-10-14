package com.ling.mall.coupon.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ling.mall.coupon.entity.SeckillSkuRelationEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 秒杀活动商品关联
 *
 * @author Ling
 * @date 2022-05-29
 */
@Mapper
public interface SeckillSkuRelationDao extends BaseMapper<SeckillSkuRelationEntity> {
	
}
