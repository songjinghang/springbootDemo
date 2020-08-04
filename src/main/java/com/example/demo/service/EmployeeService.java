package com.example.demo.service;

import com.example.demo.entity.BusinessException;
import com.example.demo.entity.Employee;
import com.example.demo.entity.ResultData;
import com.github.pagehelper.PageInfo;


public interface EmployeeService {
    PageInfo<Employee> selectAll(int pageNum,int pageSize);
    ResultData insertEmployee(Employee employee) throws BusinessException;
    Employee selectEmployeeById(int employeeId);
    ResultData updateEmployee(Employee employee) throws BusinessException;
    ResultData deleteEmployee(int employeeId) throws BusinessException;
}
