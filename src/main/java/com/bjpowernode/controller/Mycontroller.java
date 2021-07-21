package com.bjpowernode.controller;

import com.bjpowernode.domain.Student;
import com.bjpowernode.service.imp.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

@Controller
public class Mycontroller {
    @Autowired
    private StudentServiceImpl service;
    @RequestMapping("/doAdd.do")
    public String aStudent(Student student){
        System.out.println(student);
        service.addStudent(student);
        return "result";
    }
}
