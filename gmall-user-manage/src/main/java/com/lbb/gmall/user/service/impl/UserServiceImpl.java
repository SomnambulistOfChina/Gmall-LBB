package com.lbb.gmall.user.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.lbb.gmall.bean.UserAddress;
import com.lbb.gmall.bean.UserInfo;
import com.lbb.gmall.service.UserService;
import com.lbb.gmall.user.mapper.UserAddressMapper;
import com.lbb.gmall.user.mapper.UserInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

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
