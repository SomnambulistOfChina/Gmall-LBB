package com.lbb.gmall.user.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.lbb.gmall.bean.UserAddress;
import com.lbb.gmall.bean.UserInfo;
import com.lbb.gmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserService userService;
    @RequestMapping("findAll")
    public List<UserInfo> findAll(){
        return userService.findAll();
    }

    @Override
    public List<UserAddress> getUserAddressList(String userId) {
        return null;
    }
}
