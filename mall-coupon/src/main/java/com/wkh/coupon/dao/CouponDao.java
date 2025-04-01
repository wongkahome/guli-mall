package com.wkh.coupon.dao;

import com.wkh.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author wongkahome
 * @email huang_jia_hong@163.com
 * @date 2025-04-01 17:21:51
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
