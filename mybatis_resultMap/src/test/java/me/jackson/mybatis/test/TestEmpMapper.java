package me.jackson.mybatis.test;

import me.jackson.mybatis.mapper.DeptMapper;
import me.jackson.mybatis.mapper.EmpMapper;
import me.jackson.mybatis.pojo.Dept;
import me.jackson.mybatis.pojo.Emp;
import me.jackson.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @author Jackson Chen
 * @version 1.0
 * @date 2022/8/24
 */
public class TestEmpMapper {
    @Test
    public void testGetId() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        Emp empId = mapper.getEmpByEmpId(2);
        System.out.println(empId);
    }

    @Test
    public void test12() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        Emp empId = mapper.getEmpAndDept(2);
        System.out.println(empId);
    }
    @Test
    public void testByStemp() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        Emp emp = mapper.getEmpAndDeptByStepOne(1);
        emp.getEmpName();
//        System.out.println(empId);
    }
    @Test
    public void testDept() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        DeptMapper mapper = sqlSession.getMapper(DeptMapper.class);
        Dept deptAndEmpByDeptId = mapper.getDeptAndEmpByDeptId(1);
        List<Emp> emps = deptAndEmpByDeptId.getEmps();
        emps.forEach(System.out::println);
        System.out.println(deptAndEmpByDeptId);
    }
}
