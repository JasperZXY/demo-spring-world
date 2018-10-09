package com.zxy.demo.spring.mybatis.dao;

import com.zxy.demo.spring.mybatis.dao.dos.UserDO;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.jdbc.SQL;


public interface UserDAO {
    @Select("select * from user where id = #{id}")
    UserDO getById(@Param("id") Long id);

    UserDO getByIdV2(@Param("id") Long id);

    /**
     * 动态生成 SQL ，方法对应 {@link UserDAO#buildGetById(Long)}
     */
    @SelectProvider(type = UserDAO.class, method = "buildGetById")
    UserDO getByIdV3(Long id);

    static String buildGetById(Long id) {
        return new SQL() {{
            SELECT("*");
            FROM("USER");
            WHERE("id=" + id);
        }}.toString();
    }
}
