package me.jackson.mybatis.test;

import me.jackson.mybatis.mapper.DynamicMapper;
import me.jackson.mybatis.pojo.Emp;
import me.jackson.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Jackson Chen
 * @version 1.0
 * @date 2022/8/25
 */
public class TestDynamic {

    @Test
    public void testGetEmpByCondition() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        DynamicMapper mapper = sqlSession.getMapper(DynamicMapper.class);
        Emp emp = new Emp(null, "zhangsan", 13,null);
        List<Emp> emps = mapper.getEmpByCondition(emp);
        emps.forEach(System.out::println);
    }

    @Test
    public void testGetEmpByChoose() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        DynamicMapper mapper = sqlSession.getMapper(DynamicMapper.class);
        Emp emp = new Emp(null, "zhangsan", 13,null);
        List<Emp> emps = mapper.getEmpByChoose(emp);
        emps.forEach(System.out::println);
    }


    @Test
    public void testInsertMoreEmps() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        DynamicMapper mapper = sqlSession.getMapper(DynamicMapper.class);
        List<Emp> emps = new ArrayList<>();
        Emp emp = new Emp(null, "zhangsan", 13,null);
        emps.add(emp);
        emps.add(new Emp(null, "nihaowyyaya", 22, null));
        emps.add(new Emp(null, "233ddd", 22, null));
        emps.add(new Emp(null, "ff", 221, null));
        mapper.insertMoreEmps(emps);

        sqlSession.clearCache();
        sqlSession.close();
    }

    @Test
    public void testDeleteMoreEmps() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        DynamicMapper mapper = sqlSession.getMapper(DynamicMapper.class);
        int[] empIds = new int[] {13,14,15,16};
        mapper.deleteMoreEmps(empIds);

        sqlSession.clearCache();
        sqlSession.close();
    }
}
