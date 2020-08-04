package com.example.demo.service;

import com.example.demo.entity.BusinessException;
import com.example.demo.entity.Employee;
import com.example.demo.entity.ResultData;
import com.example.demo.mapper.EmployeeMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeMapper employeeMapper;
    @Override
    public PageInfo<Employee> selectAll(int pageNum,int pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<Employee> list = employeeMapper.selectAll();
        PageInfo<Employee> pageInfo = new PageInfo<Employee>(list);
        return pageInfo;
    }
    @Override
    public ResultData insertEmployee(Employee employee) throws BusinessException {
        ResultData resultData = null;
        try{
            employeeMapper.insertSelective(employee);
            return resultData = new ResultData(true,"新增成功",null);
        }catch (Exception e){
            e.printStackTrace();
            throw new  BusinessException("新增失败");
        }
    }

    @Override
    public Employee selectEmployeeById(int employeeId) {
        return employeeMapper.selectByPrimaryKey(employeeId);
    }

    @Override
    public ResultData updateEmployee(Employee employee) throws BusinessException {
        ResultData resultData = null;
        try{
            employeeMapper.updateByPrimaryKeySelective(employee);
            return resultData = new ResultData(true,"修改成功",null);
        }catch (Exception e){
            e.printStackTrace();
            throw new  BusinessException("修改失败");
        }
    }

    @Override
    public ResultData deleteEmployee(int employeeId) throws BusinessException {
        ResultData resultData = null;
        try{
            employeeMapper.deleteByPrimaryKey(employeeId);
            return resultData = new ResultData(true,"删除成功",null);
        }catch (Exception e){
            e.printStackTrace();
            throw new  BusinessException("删除失败");
        }
    }
}
