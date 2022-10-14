package com.ling.mall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ling.common.utils.PageUtils;
import com.ling.mall.order.entity.RefundInfoEntity;

import java.util.Map;

/**
 * 退款信息
 * @author Ling
 * @date 2022-06-16
 */
public interface RefundInfoService extends IService<RefundInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

