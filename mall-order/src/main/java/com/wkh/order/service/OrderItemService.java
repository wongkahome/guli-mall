package com.wkh.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wkh.common.utils.PageUtils;
import com.wkh.order.entity.OrderItemEntity;

import java.util.Map;

/**
 * 订单项信息
 *
 * @author wongkahome
 * @email huang_jia_hong@163.com
 * @date 2025-04-01 10:18:34
 */
public interface OrderItemService extends IService<OrderItemEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

