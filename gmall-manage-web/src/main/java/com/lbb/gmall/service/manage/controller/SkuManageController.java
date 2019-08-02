package com.lbb.gmall.service.manage.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.lbb.gmall.bean.SkuInfo;
import com.lbb.gmall.bean.SpuImage;
import com.lbb.gmall.bean.SpuSaleAttr;
import com.lbb.gmall.service.ManageService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * *
 *
 * @description:sku销售属性
 * @program: Gmall-LBB
 * @author: 李国毅 on 2019-08-0115:08
 * @E-mail: 41893083@qq.com
 **/

@RestController
@CrossOrigin
public class SkuManageController {


    @Reference
    private ManageService manageService;

    @RequestMapping("spuImageList")
    public List<SpuImage> spuImageList(SpuImage spuImage){
        // 调用service 层
        List<SpuImage> spuImageList = manageService.getSpuImageList(spuImage);
        return spuImageList;
    }

    @RequestMapping("spuSaleAttrList")
    public List<SpuSaleAttr> spuSaleAttrList(String spuId){
        // 调用service 层
        return manageService.getSpuSaleAttrList(spuId);
    }
    @RequestMapping("saveSkuInfo")
    public void saveSkuInfo(@RequestBody SkuInfo skuInfo){
        if (skuInfo!=null){
            manageService.saveSkuInfo(skuInfo);
        }

    }
}
