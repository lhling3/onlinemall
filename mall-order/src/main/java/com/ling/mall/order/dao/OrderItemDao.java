package com.ling.mall.order.dao;

import com.ling.mall.order.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 * @author Ling
 * @date 2022-04-16
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {
	
}
