package com.nanshan.nanshan.serviceimpl;

import com.nanshan.nanshan.beans.User;
import com.nanshan.nanshan.dao.UserMapper;
import com.nanshan.nanshan.service.Uservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements Uservice {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> get() {

        return userMapper.selectByExample(null);
    }
}
