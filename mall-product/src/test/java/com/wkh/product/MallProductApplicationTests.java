package com.wkh.product;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.wkh.product.entity.BrandEntity;
import com.wkh.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class MallProductApplicationTests {

    @Autowired
    BrandService brandService;

    @Test
    void contextLoads() {
        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setName("华为");
        brandService.save(brandEntity);
        System.out.println("保存成功");

        brandEntity.setBrandId(1L);
        brandEntity.setDescript("华为");
        boolean b = brandService.updateById(brandEntity);
        System.out.println(b);

        List<BrandEntity> list = brandService.list(new QueryWrapper<BrandEntity>().eq("brand_id", 1L));
        list.forEach((item)->{
            System.out.println(item);
        });

    }

}
