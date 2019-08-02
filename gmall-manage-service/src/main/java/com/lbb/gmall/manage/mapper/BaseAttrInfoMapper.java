package com.lbb.gmall.manage.mapper;

import com.lbb.gmall.bean.BaseAttrInfo;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface BaseAttrInfoMapper extends Mapper<BaseAttrInfo> {
/**
*
*@description:  根据三级分类查询平台属性
*@author: 李国毅 on * 2019-08-01 18:44
*@E-mail:  41893083@qq.com
**/
List<BaseAttrInfo> getBaseAttrInfoListByCatalog3Id(String catalog3Id);
}
