package com.example.demo.service;


import com.example.demo.entity.ResultData;
import com.example.demo.entity.User;
import com.example.demo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public ResultData login(User user) {
        List<User> list = userMapper.select(user);
        if(list != null && list.size() > 0){
            return new ResultData(true,"登录成功",list.get(0));
        }
        return new ResultData(false,"登录失败",null);
    }
}
