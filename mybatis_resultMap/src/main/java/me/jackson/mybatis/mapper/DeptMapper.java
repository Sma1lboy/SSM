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
public interface DeptMapper {
    Dept getEmpAndDeptByStepTwo(@Param("deptId") Integer deptId);

    Dept getDeptAndEmpByDeptId(@Param("deptId") Integer deptId);
    Dept getDeptAndEmpByDeptIdStepOne(@Param("deptId") Integer deptId);

}
