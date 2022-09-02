package me.jackson.spring.test;

import me.jackson.spring.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @author Jackson Chen
 * @version 1.0
 * @date 2022/8/31
 */
//指定当前测试类在spring的测试环境中执行 此时就可以通过 注入的方式  直接获取IOC容器的bean
@RunWith(SpringJUnit4ClassRunner.class    )
//设置Spring测试环境的配置文件
@ContextConfiguration("classpath:applicationContext.xml")
public class JDBCTemplateTest {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Test
    public void test(){
        String sql = "insert into t_user values(null, ?, ?, ?, ?, ?)";

        int i = jdbcTemplate.update(sql, "SUDOroot", "123", 12, "男", "541898146@epofj");
        System.out.println(i);
    }
    @Test
    public void testSelect(){
        String sql = "select * from t_user where id =?";

        User user = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(User.class), 3);
        System.out.println(user);
    }
    @Test
    public void testSelectMore(){

        String sql = "select * from t_user";

        List<User> query = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(User.class));
        query.forEach(System.out::println);
    }
    @Test
    public void testCount(){
        String sql = "select count(*) from t_user";
        int rows = jdbcTemplate.queryForObject(sql, Integer.class);
        System.out.println(rows);
    }
}
