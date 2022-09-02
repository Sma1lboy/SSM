package me.jackson.mybatis.test;

import me.jackson.mybatis.mapper.EmpMapper;
import me.jackson.mybatis.pojo.Emp;
import me.jackson.mybatis.pojo.EmpExample;
import me.jackson.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @author Jackson Chen
 * @version 1.0
 * @date 2022/8/27
 */
public class MBGTest {
    @Test
    public void testMBG() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        /*
           根据id查询数据
         */
//        Emp emp = mapper.selectByPrimaryKey(1);
//        System.out.println(emp);
        /*
            查询所有数据
         */
//        List<Emp> emps = mapper.selectByExample(new EmpExample());
        /*
            and查询条件
         */
//        EmpExample empExample = new EmpExample();
//        empExample.createCriteria().andEmpNameLike("zhangsan").andAgeLessThan(13);
//        List<Emp> emps = mapper.selectByExample(empExample);

        /*
          根据and or 查询
         */
//        EmpExample empExample = new EmpExample();
//        empExample.createCriteria().andEmpNameLike("zhangsan").andAgeLessThan(13);
//        //上面的条件和下面的条件就是以or来连接的
//        empExample.or().andGenderEqualTo("男");
//        List<Emp> emps = mapper.selectByExample(empExample);
//        emps.forEach(System.out::println );

        /*
        普通修改 就算当前属性值为 null 也会修改mysql
         */
//        Emp emp = new Emp(1, "大男人", null, "女");
//        mapper.updateByPrimaryKey(emp);

        /*
        选择性修改 null的值不会传入mysql当中
         */
        Emp emp = new Emp(2, "大男人", null, "女");
        mapper.updateByPrimaryKeySelective(emp);


    }
}
