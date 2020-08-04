package com.example.demo.controller;

import com.example.demo.entity.BusinessException;
import com.example.demo.entity.Employee;
import com.example.demo.entity.ResultData;
import com.example.demo.service.EmployeeService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.List;

@RestController
@RequestMapping("/emp")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @ResponseBody
    @GetMapping("/selectEmp")
    public PageInfo<Employee> selectEmployee(int pageNum,int pageSize){
        PageInfo<Employee> pageInfo = employeeService.selectAll(pageNum,pageSize);
        System.out.println(pageInfo);
        return pageInfo;
    }

//    @RequestMapping("/thyEmpList")
//    public String thyEmpList(int pageNum, int pageSize, Model model, HttpSession session){
//        PageInfo<Employee> pageInfo = employeeService.selectAll(pageNum,pageSize);
//        model.addAttribute("empInfo",pageInfo);
//        model.addAttribute("test","张三");
//        session.setAttribute("name","sjh");
//        return "empList";
//    }

    @PostMapping("/insertEmployee")
    public ResultData insertEmployee(Employee employee) throws BusinessException {
        System.out.println(employee);
        return employeeService.insertEmployee(employee);
    }

    @GetMapping("/selectEmployeeById/{employeeId}")
    public Employee selectEmployeeById(@PathVariable int employeeId){
        Employee employee = employeeService.selectEmployeeById(employeeId);
        System.out.println(employee);
        return employee;
    }

    @PostMapping("/updateEmployee")
    public ResultData updateEmployee(@RequestBody Employee employee) throws BusinessException {
        System.out.println(employee);
        return employeeService.updateEmployee(employee);
    }

    @DeleteMapping("/deleteEmployee/{employeeId}")
    public ResultData deleteEmployee(@PathVariable int employeeId) throws BusinessException {
        System.out.println(employeeId);
        return employeeService.deleteEmployee(employeeId);
    }



}
