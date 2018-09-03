package com.zxy.demo.spring.mybatis.dao;

import com.zxy.demo.spring.mybatis.dao.dos.UserDO;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface UserDAO {
    @Select("select * from user where id = #{id}")
    UserDO getById(@Param("id") Long id);

    UserDO getByIdV2(@Param("id") Long id);
}
