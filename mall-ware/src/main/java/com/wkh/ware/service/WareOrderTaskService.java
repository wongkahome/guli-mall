package com.wkh.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wkh.common.utils.PageUtils;
import com.wkh.ware.entity.WareOrderTaskEntity;

import java.util.Map;

/**
 * 库存工作单
 *
 * @author wongkahome
 * @email huang_jia_hong@163.com
 * @date 2025-04-01 17:26:57
 */
public interface WareOrderTaskService extends IService<WareOrderTaskEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

