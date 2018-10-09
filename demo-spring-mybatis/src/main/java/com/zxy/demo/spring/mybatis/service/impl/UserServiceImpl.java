package com.zxy.demo.spring.mybatis.service.impl;

import com.zxy.demo.spring.mybatis.dao.UserDAO;
import com.zxy.demo.spring.mybatis.service.UserService;
import com.zxy.demo.spring.mybatis.dao.dos.UserDO;

import org.apache.ibatis.jdbc.SQL;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


@Service("userService")
public class UserServiceImpl implements UserService {

    @Resource
    private UserDAO userDAO;

    @Resource
    private SqlSessionFactory sqlSessionFactory;


    @Override
    public UserDO getById(Long id) {
        return userDAO.getById(id);
    }


    public UserDO getByIdV2(Long id) {
        return userDAO.getByIdV2(id);
    }
    public UserDO getByIdV3(Long id) {
        return userDAO.getByIdV3(id);
    }


    /**
     * 演示 session.selectOne
     * @param id
     * @return
     */
    public UserDO getByIdV4(Long id) {
        SqlSession session = sqlSessionFactory.openSession();
        try {
            return (UserDO) session.selectOne("com.zxy.demo.spring.mybatis.dao.UserDAO.getByIdV2", id);
        } finally {
            session.close();
        }
    }
}
