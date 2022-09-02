package me.jackson.mybatis.mapper;

import me.jackson.mybatis.pojo.Dept;
import me.jackson.mybatis.pojo.Emp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author Jackson Chen
 * @version 1.0
 * @date 2022/8/24
 */
public interface EmpMapper {


    Emp getEmpByEmpId(@Param("empId") Integer empId);

    /**
     * get emp and dept
     * @param empId
     * @return
     */
    Emp getEmpAndDept(@Param("empId") Integer empId);


    Emp getEmpAndDeptByStepOne(@Param("empId") Integer empId);

//    @Param("deptName") String deptName
    List<Emp> getDeptAndEmpByDeptIdStepTwo(@Param("deptId") Integer deptId);
}
