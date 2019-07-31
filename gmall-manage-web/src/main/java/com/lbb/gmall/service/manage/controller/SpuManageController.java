package com.lbb.gmall.service.manage.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.lbb.gmall.bean.SpuInfo;
import com.lbb.gmall.service.ManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * *
 *
 * @description:spuList封装
 * @program: Gmall-LBB
 * @author: 李国毅 on 2019-07-3019:46
 * @E-mail: 41893083@qq.com
 **/

//Request URL: http://localhost:8082/spuList?catalog3Id=1   实体类封装
    @RestController
    @CrossOrigin
public class SpuManageController {
@Reference
    private ManageService manageService;
    @RequestMapping("spuList")
public List<SpuInfo> spuList(SpuInfo spuInfo){
    return manageService.getSpulist(spuInfo);
}
}
