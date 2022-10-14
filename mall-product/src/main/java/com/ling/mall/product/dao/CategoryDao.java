package com.ling.mall.product.dao;

import com.ling.mall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 *
 * @author Ling
 * @date 2022-04-25
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
