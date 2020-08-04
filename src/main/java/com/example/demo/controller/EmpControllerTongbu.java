package com.example.demo.controller;

import com.example.demo.entity.BusinessException;
import com.example.demo.entity.Employee;
import com.example.demo.entity.ResultData;
import com.example.demo.service.EmployeeService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/empTongbu")
public class EmpControllerTongbu {
    @Autowired
    private EmployeeService employeeService;
    @RequestMapping("/empList")
    public String thyEmpList(Integer pageNum, Integer pageSize, Model model){
        if(pageNum == null)pageNum=1;
        if(pageSize == null)pageSize=20;
        PageInfo<Employee> pageInfo = employeeService.selectAll(pageNum,pageSize);
        model.addAttribute("empInfo",pageInfo);
        return "tongbu/empList";
    }
    @RequestMapping("/insertEmployee")
    public String insertEmployee(Employee employee,Model model) throws BusinessException {
        System.out.println(employee);
        ResultData resultData = employeeService.insertEmployee(employee);
        return "redirect:/empTongbu/empList";
    }
    @RequestMapping("/selectEmployeeById/{employeeId}")
    public String selectEmployeeById(@PathVariable Integer employeeId, Model model){
        Employee employee = employeeService.selectEmployeeById(employeeId);
        System.out.println(employee);
        model.addAttribute("empInfo",employee);
        return "tongbu/updateEmp";
    }

    @RequestMapping("/updateEmployee")
    public String updateEmployee(Employee employee,Model model) throws BusinessException {
        System.out.println(employee);
        ResultData resultData = employeeService.updateEmployee(employee);
        return "redirect:/empTongbu/empList";
    }
    @RequestMapping("/deleteEmployee/{employeeId}")
    public String deleteEmployee(@PathVariable Integer employeeId,Model model) throws BusinessException {
        System.out.println(employeeId);
        ResultData resultData = employeeService.deleteEmployee(employeeId);
        return "redirect:/empTongbu/empList";
    }
}
