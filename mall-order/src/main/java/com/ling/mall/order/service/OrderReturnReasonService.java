package com.ling.mall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ling.common.utils.PageUtils;
import com.ling.mall.order.entity.OrderReturnReasonEntity;

import java.util.Map;

/**
 * 退货原因
 * @author Ling
 * @date 2022-06-16
 */
public interface OrderReturnReasonService extends IService<OrderReturnReasonEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

