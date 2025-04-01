package com.wkh.product.dao;

import com.wkh.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author wongkahome
 * @email huang_jia_hong@163.com
 * @date 2025-04-01 16:43:31
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
