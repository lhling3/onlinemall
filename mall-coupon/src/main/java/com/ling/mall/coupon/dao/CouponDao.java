package com.ling.mall.coupon.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ling.mall.coupon.entity.CouponEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 *
 * @author Ling
 * @date 2022-05-27
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
