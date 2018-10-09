package com.zxy.demo.spring.mybatis.service.impl;

import com.zxy.demo.spring.mybatis.dao.UserDAO;
import com.zxy.demo.spring.mybatis.service.UserService;
import com.zxy.demo.spring.mybatis.dao.dos.UserDO;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Resource
    private UserDAO userDAO;

    @Override
    public UserDO getById(Long id) {
        return userDAO.getById(id);
    }

    public UserDO getByIdV2(Long id) {
        return userDAO.getByIdV2(id);
    }
}
