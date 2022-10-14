package com.ling.mall.coupon.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ling.mall.coupon.entity.CouponHistoryEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券领取历史记录
 *
 * @author Ling
 * @date 2022-05-27
 */
@Mapper
public interface CouponHistoryDao extends BaseMapper<CouponHistoryEntity> {
	
}
