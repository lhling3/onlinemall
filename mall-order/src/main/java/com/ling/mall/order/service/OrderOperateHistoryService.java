package com.ling.mall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ling.common.utils.PageUtils;
import com.ling.mall.order.entity.OrderOperateHistoryEntity;

import java.util.Map;

/**
 * 订单操作历史记录
 * @author Ling
 * @date 2022-06-16
 */
public interface OrderOperateHistoryService extends IService<OrderOperateHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

