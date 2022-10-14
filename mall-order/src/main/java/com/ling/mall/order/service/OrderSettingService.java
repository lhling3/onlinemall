package com.ling.mall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ling.common.utils.PageUtils;
import com.ling.mall.order.entity.OrderSettingEntity;

import java.util.Map;

/**
 * 订单配置信息
 * @author Ling
 * @date 2022-06-16
 */
public interface OrderSettingService extends IService<OrderSettingEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

