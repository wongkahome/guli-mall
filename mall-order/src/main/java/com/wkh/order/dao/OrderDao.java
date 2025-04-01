package com.wkh.order.dao;

import com.wkh.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author wongkahome
 * @email huang_jia_hong@163.com
 * @date 2025-04-01 10:18:34
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
