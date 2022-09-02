package me.jackson.mybatis.test;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import me.jackson.mybatis.mapper.EmpMapper;
import me.jackson.mybatis.pojo.Emp;
import me.jackson.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @author Jackson Chen
 * @version 1.0
 * @date 2022/8/27
 */
public class PageTest {

    @Test
    public void testPage(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);

        //实现分页功能得在查询功能之前
        Page<Object> objectPage = PageHelper.startPage(2, 4);
        List<Emp> emps = mapper.selectByExample(null);
        emps.forEach(System.out::println);
        //在查询功能之后我们可以获取和分页相关的所有数据
        PageInfo<Emp> empPageInfo = new PageInfo<>(emps, 2);
        System.out.println(empPageInfo);

    }
}
