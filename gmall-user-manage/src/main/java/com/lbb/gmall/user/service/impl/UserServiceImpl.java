package com.lbb.gmall.user.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.lbb.gmall.UserAddress;
import com.lbb.gmall.UserInfo;
import com.lbb.gmall.UserService;
import com.lbb.gmall.user.mapper.UserAddressMapper;
import com.lbb.gmall.user.mapper.UserInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserInfoMapper userInfoMapper;

    @Autowired
    private UserAddressMapper userAddressMapper;
    @Override
    public List<UserInfo> findAll() {
        return userInfoMapper.selectAll();
    }

    @Override
    public List<UserAddress> getUserAddressList(String userId) {
        // 调用mapper
        // select * from userAddress where userId=?
        UserAddress userAddress = new UserAddress();
        userAddress.setUserId(userId);
        return    userAddressMapper.select(userAddress);
    }
}
