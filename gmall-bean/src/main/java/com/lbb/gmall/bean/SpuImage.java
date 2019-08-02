package com.lbb.gmall.bean;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * *
 *
 * @description:
 * @program: Gmall-LBB
 * @author: 李国毅 on 2019-08-0101:09
 * @E-mail: 41893083@qq.com
 **/

@Data
public class SpuImage  implements Serializable {
    @Column
    @Id
    private String id;
    @Column
    private String spuId;
    @Column
    private String imgName;
    @Column
    private String imgUrl;
}
