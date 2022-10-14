package com.ling.mall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ling.common.utils.PageUtils;
import com.ling.mall.member.entity.IntegrationChangeHistoryEntity;

import java.util.Map;

/**
 * 积分变化历史记录
 * @author Ling
 * @date 2022-04-21
 */
public interface IntegrationChangeHistoryService extends IService<IntegrationChangeHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

