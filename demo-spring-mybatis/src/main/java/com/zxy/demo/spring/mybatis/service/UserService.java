package com.zxy.demo.spring.mybatis.service;

import com.zxy.demo.spring.mybatis.dao.dos.UserDO;

public interface UserService {

    UserDO getById(Long id);

    UserDO getByIdV2(Long id);
}
