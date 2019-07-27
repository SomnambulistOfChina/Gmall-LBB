package com.lbb.gmall.bean;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * *
 *
 * @description: Serializable实体类
 * @program: Gmall-LBB
 * @author: 李国毅 on 2019-07-2519:11
 * @E-mail: 41893083@qq.com
 **/

@Data
public class BaseAttrValue implements Serializable {
    @Id
    @Column
    private String id;
    @Column
    private String valueName;
    @Column
    private String attrId;
}

