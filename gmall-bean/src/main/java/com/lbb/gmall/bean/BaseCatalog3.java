package com.lbb.gmall.bean;

/**
 * *
 *
 * @description: BaseCatalog3实体类
 * @program: Gmall-LBB
 * @author: 李国毅 on 2019-07-2519:09
 * @E-mail: 41893083@qq.com
 **/


import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
@Data
public class BaseCatalog3 implements Serializable {
    @Id
    @Column
    private String id;
    @Column
    private String name;
    @Column
    private String catalog2Id;
}
