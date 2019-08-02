package com.lbb.gmall.bean;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Transient;
import java.io.Serializable;
import java.util.List;


/**
 * *
 *
 * @description:
 * @program: Gmall-LBB
 * @author: 李国毅 on 2019-08-0101:03
 * @E-mail: 41893083@qq.com
 **/

@Data
public class SpuSaleAttr implements Serializable {
    @Id
    @Column
    String id ;

    @Column
    String spuId;

    @Column
    String saleAttrId;

    @Column
    String saleAttrName;

    @Transient
    List<SpuSaleAttrValue> spuSaleAttrValueList;
}