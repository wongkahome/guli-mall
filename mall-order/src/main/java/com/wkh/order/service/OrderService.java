package com.wkh.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wkh.common.utils.PageUtils;
import com.wkh.order.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author wongkahome
 * @email huang_jia_hong@163.com
 * @date 2025-04-01 10:18:34
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

