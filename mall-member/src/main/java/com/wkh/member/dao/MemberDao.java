package com.wkh.member.dao;

import com.wkh.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author wongkahome
 * @email huang_jia_hong@163.com
 * @date 2025-04-01 17:19:00
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
