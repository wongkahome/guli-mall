package com.wkh.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wkh.common.utils.PageUtils;
import com.wkh.coupon.entity.SkuFullReductionEntity;

import java.util.Map;

/**
 * 商品满减信息
 *
 * @author wongkahome
 * @email huang_jia_hong@163.com
 * @date 2025-04-01 17:21:51
 */
public interface SkuFullReductionService extends IService<SkuFullReductionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

