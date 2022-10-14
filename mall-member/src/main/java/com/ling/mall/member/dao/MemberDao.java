package com.ling.mall.member.dao;

import com.ling.mall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * @author Ling
 * @date 2022-06-10
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
