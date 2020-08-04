package com.example.demo.service;

import com.example.demo.entity.ResultData;
import com.example.demo.entity.User;


public interface UserService {
    ResultData login(User user);
}
