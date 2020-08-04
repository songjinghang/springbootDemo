package com.example.demo.mapper;

import com.example.demo.common.CommonMapper;
import com.example.demo.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface UserMapper extends CommonMapper<User> {
}