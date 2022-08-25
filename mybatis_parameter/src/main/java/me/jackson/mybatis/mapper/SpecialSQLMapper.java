package me.jackson.mybatis.mapper;

import me.jackson.mybatis.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author Jackson Chen
 * @version 1.0
 * @date 2022/8/23
 */
public interface SpecialSQLMapper {
    /**
     * 通过用户名模糊查询返回users
     * @param mohu
     * @return
     */
    List<User> getUserByLike(@Param("mohu") String mohu);

    void deleteMoreUser(@Param("ids") String ids);

    List<User> getUserByTable(@Param("tablename") String tableName);

    /**
     * 添加用户信息并获取自增的主键
     * @param user
     */
    void insertUser(User user);
}
