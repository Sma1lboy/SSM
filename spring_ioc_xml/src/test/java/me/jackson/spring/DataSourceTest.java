package me.jackson.spring;

import com.alibaba.druid.pool.DruidDataSource;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLException;

/**
 * @author Jackson Chen
 * @version 1.0
 * @date 2022/8/28
 */
public class DataSourceTest {
    @Test
    public void testDataSource() throws SQLException {
        ApplicationContext ioc = new ClassPathXmlApplicationContext("spring-datasource.xml");
        //常用获取方式 通过类型获取
        DruidDataSource dataSource = ioc.getBean(DruidDataSource.class);

        System.out.println(dataSource.getConnection());

    }
}
