package com.wkh.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wkh.common.utils.PageUtils;
import com.wkh.member.entity.MemberEntity;

import java.util.Map;

/**
 * 会员
 *
 * @author wongkahome
 * @email huang_jia_hong@163.com
 * @date 2025-04-01 17:19:00
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

