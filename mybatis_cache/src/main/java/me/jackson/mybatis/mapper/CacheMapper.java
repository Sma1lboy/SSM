package me.jackson.mybatis.mapper;

import me.jackson.mybatis.pojo.Emp;
import org.apache.ibatis.annotations.Param;

/**
 * @author Jackson Chen
 * @version 1.0
 * @date 2022/8/25
 */
public interface CacheMapper {

    Emp getEmpById(@Param("empId") Integer empId);

    void insertEmp( Emp emp);
}
