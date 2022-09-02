package me.jackson.mybatis.test;

import me.jackson.mybatis.mapper.CacheMapper;
import me.jackson.mybatis.pojo.Emp;
import me.jackson.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

/**
 * @author Jackson Chen
 * @version 1.0
 * @date 2022/8/25
 */
public class CacheMapperTest {

    @Test
    public void testSecondMemo(){

        SqlSession sqlSession1 = SqlSessionUtil.getSqlSession();
        SqlSession sqlSession2 = SqlSessionUtil.getSqlSession();
        CacheMapper mapper1 = sqlSession1.getMapper(CacheMapper.class);
        CacheMapper mapper2 = sqlSession2.getMapper(CacheMapper.class);

        Emp emp1 = mapper1.getEmpById(1);
        System.out.println(emp1);
        sqlSession1.close();

        Emp emp2 = mapper2.getEmpById(1);
        System.out.println(emp2);
    }
    @Test
    public void testGetEmpById(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        CacheMapper mapper = sqlSession.getMapper(CacheMapper.class);
        Emp emp = mapper.getEmpById(1);
        System.out.println(emp );
        sqlSession.clearCache();
        Emp emp4 = mapper.getEmpById(1);
        System.out.println(emp4);


//        SqlSession sqlSession1 = SqlSessionUtil.getSqlSession();
//        CacheMapper mapper1 = sqlSession1.getMapper(CacheMapper.class);
//        Emp emp3 = mapper1.getEmpById(1);
//        System.out.println(emp3);
    }
}
