package com.lbb.gmall.service;

import com.lbb.gmall.bean.UserAddress;
import com.lbb.gmall.bean.UserInfo;

import java.util.List;

/**
 * *
 *
 * @description:User接口
 * @program: Gmall-LBB
 * @author: 李国毅 on 2019-07-2419:44
 * @E-mail: 41893083@qq.com
 **/


public interface UserService {
    /**
     * 查询所有数据
     *
     * @return
     */
    List<UserInfo> findAll();

    /**
     * 根据userId 查询用户地址列表
     *
     * @param userId
     * @return
     */
    List<UserAddress> getUserAddressList(String userId);

}
