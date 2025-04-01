package com.wkh.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wkh.common.utils.PageUtils;
import com.wkh.product.entity.AttrEntity;

import java.util.Map;

/**
 * 商品属性
 *
 * @author wongkahome
 * @email huang_jia_hong@163.com
 * @date 2025-04-01 16:43:32
 */
public interface AttrService extends IService<AttrEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

