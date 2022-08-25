package me.jackson.mybatis.test;

import me.jackson.mybatis.mapper.SpecialSQLMapper;
import me.jackson.mybatis.pojo.User;
import me.jackson.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @author Jackson Chen
 * @version 1.0
 * @date 2022/8/23
 */
public class SpeicalSQLMapperTest {


    @Test
    public void testGetUserByLike(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SpecialSQLMapper mapper = sqlSession.getMapper(SpecialSQLMapper.class);
        List<User> userList = mapper.getUserByLike("ao");
        userList.forEach(System.out::println);
    }
    @Test
    public void testDeleteMoreUser(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SpecialSQLMapper mapper = sqlSession.getMapper(SpecialSQLMapper.class);
        mapper.deleteMoreUser("1,2");
    }

    @Test
    public void testUserByTable(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SpecialSQLMapper mapper = sqlSession.getMapper(SpecialSQLMapper.class);
        List<User> users = mapper.getUserByTable("t_user");
        users.forEach(System.out::println);

    }

    @Test
    public void testInsertUser(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SpecialSQLMapper mapper = sqlSession.getMapper(SpecialSQLMapper.class);
        User user = new User(null, "nb", "sd", 12, "男", "wqoiewjqoi@gmail.com");
        System.out.println(user);
        mapper.insertUser(user);
        System.out.println(user);

    }
}
