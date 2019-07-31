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
 * @author: 李国毅 on 2019-07-2419:53
 * @E-mail: 41893083@qq.com
 **/

@Data
public class UserAddress implements Serializable {

    @Column
    @Id
    private String id;
    @Column
    private String userAddress;
    @Column
    private String userId;
    @Column
    private String consignee;
    @Column
    private String phoneNum;
    @Column
    private String isDefault;
}
