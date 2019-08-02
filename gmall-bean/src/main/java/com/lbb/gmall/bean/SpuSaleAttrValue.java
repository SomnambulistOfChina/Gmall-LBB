package com.lbb.gmall.bean;


import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Transient;
import java.io.Serializable;

/**
 * *
 *
 * @description:
 * @program: Gmall-LBB
 * @author: 李国毅 on 2019-08-0101:05
 * @E-mail: 41893083@qq.com
 **/

@Data
public class SpuSaleAttrValue implements Serializable {

    @Id
    @Column
    String id;

    @Column
    String spuId;

    @Column
    String saleAttrId;

    @Column
    String saleAttrValueName;

    @Transient
    String isChecked;

}
