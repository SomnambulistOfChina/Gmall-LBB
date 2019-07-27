package com.lbb.gmall.manage.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.lbb.gmall.bean.Student;
import com.lbb.gmall.service.StudentService;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Override
    public List<Student> findAll() {
        return null;
    }
}
