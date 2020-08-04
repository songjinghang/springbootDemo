package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CommonController {
    @RequestMapping("/login")
    public String login(){
        return "login";
    }
    //异步
    @RequestMapping("/empList")
    public String toEmpList(){
        return "empList";
    }
    @RequestMapping("/insertEmp")
    public String toInsertEmp(){
        return "insertEmp";
    }
    @RequestMapping("/updateEmp")
    public String toUpdateEmpEmp(){
        return "updateEmp";
    }

    //同步 tongbu文件夹下
    @RequestMapping("/tongbu/insertEmp")
    public String InsertEmp(){
        return "tongbu/insertEmp";
    }

    //vue vue文件夹下
    @RequestMapping("/vue/empList")
    public String toVueEmpList(){
        return "vue/empList";
    }
    @RequestMapping("/vue/insertEmp")
    public String toVueInsertEmp(){
        return "vue/insertEmp";
    }
    @RequestMapping("/vue/updateEmp")
    public String toVueUpdateEmpEmp(){
        return "vue/updateEmp";
    }
}
