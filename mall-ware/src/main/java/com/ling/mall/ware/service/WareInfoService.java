package com.ling.mall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ling.common.utils.PageUtils;
import com.ling.mall.ware.entity.WareInfoEntity;
import com.ling.mall.ware.vo.FareVo;

import java.util.Map;

/**
 * 仓库信息
 *
 * @author Ling
 * @date 2022-04-28
 */
public interface WareInfoService extends IService<WareInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);

    /**
     * 获取运费和收货地址信息
     * @param addrId
     * @return
     */
    FareVo getFare(Long addrId);
}

