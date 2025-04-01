package com.wkh.order.dao;

import com.wkh.order.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 * 
 * @author wongkahome
 * @email huang_jia_hong@163.com
 * @date 2025-04-01 10:18:34
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {
	
}
