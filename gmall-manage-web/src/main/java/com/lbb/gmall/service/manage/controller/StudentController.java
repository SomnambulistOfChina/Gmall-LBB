package com.lbb.gmall.service.manage.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.lbb.gmall.bean.Student;
import com.lbb.gmall.service.StudentService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    @Reference
    private StudentService studentService;
    @RequestMapping("findAll")
    public List<Student> findAll(){
      return studentService.findAll();
    }
}
