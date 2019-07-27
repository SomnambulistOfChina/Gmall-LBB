package com.lbb.gmall.bean;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * *
 *
 * @description: BaseCatalog1实体类
 * @program: Gmall-LBB
 * @author: 李国毅 on 2019-07-2519:07
 * @E-mail: 41893083@qq.com
 **/
@Data
public class BaseCatalog1 implements Serializable {
    @Id
    @Column
    private String id;
    @Column
    private String name;
}
