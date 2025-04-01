package com.wkh.order.dao;

import com.wkh.order.entity.PaymentInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 支付信息表
 * 
 * @author wongkahome
 * @email huang_jia_hong@163.com
 * @date 2025-04-01 10:18:33
 */
@Mapper
public interface PaymentInfoDao extends BaseMapper<PaymentInfoEntity> {
	
}
