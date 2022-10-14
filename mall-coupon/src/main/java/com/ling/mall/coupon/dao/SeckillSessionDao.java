package com.ling.mall.coupon.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ling.mall.coupon.entity.SeckillSessionEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 秒杀活动场次
 *
 * @author Ling
 * @date 2022-05-27
 */
@Mapper
public interface SeckillSessionDao extends BaseMapper<SeckillSessionEntity> {
	
}
