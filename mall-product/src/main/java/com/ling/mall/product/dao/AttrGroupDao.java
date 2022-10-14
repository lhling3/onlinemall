package com.ling.mall.product.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ling.mall.product.entity.AttrGroupEntity;
import com.ling.mall.product.vo.SpuItemAttrGroupVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 属性分组
 *
 * @author Ling
 * @date 2022-04-25
 */
@Mapper
public interface AttrGroupDao extends BaseMapper<AttrGroupEntity> {

    List<SpuItemAttrGroupVo> getAttrGroupWithAttrsBySpuId(@Param("spuId") Long spuId, @Param("catalogId") Long catalogId);
}
