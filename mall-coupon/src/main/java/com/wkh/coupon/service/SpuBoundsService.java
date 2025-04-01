package com.wkh.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wkh.common.utils.PageUtils;
import com.wkh.coupon.entity.SpuBoundsEntity;

import java.util.Map;

/**
 * 商品spu积分设置
 *
 * @author wongkahome
 * @email huang_jia_hong@163.com
 * @date 2025-04-01 17:21:51
 */
public interface SpuBoundsService extends IService<SpuBoundsEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

