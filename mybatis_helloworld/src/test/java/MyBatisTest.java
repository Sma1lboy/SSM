import me.jackson.mybatis.mapper.UserMapper;
import me.jackson.mybatis.pojo.User;
import me.jackson.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @author Jackson Chen
 * @version 1.0
 * @date 2022/8/20
 */
public class MyBatisTest {

    @Test
    public void testInsert() throws IOException {
        //核心配置文件的输入流
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        //获取SqlSessionFacotryBuilder 明显是SqlSessionFactory的构造器 能帮助我们创建SqlSessionFacotry
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        //获取SqlSessionFactory
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(is);
        //获取sql的会话对象SqlSession(是不会自动提交事务) 是MyBatis提供的操作数据库的对象
        SqlSession session = sqlSessionFactory.openSession(true);
        //获取UserMapper 的代理实现类对象
        //getMapper会帮我们自动去生成UserMapper这个接口类
        //实现方式
        //通过当前接口的全类名
        //找到当前的映射文件
        //通过当前接口的方法
        //来找到当前映射文件的sql语句 并将结果返回
        //这种方法使用的最多
        UserMapper userMapper = session.getMapper(UserMapper.class);
//        //调用mapper接口中的方法 实现添加用户实现的功能
        int insertUser = userMapper.insertUser();
        System.out.println("res:" + insertUser);

//        提供唯一标识找到sql并执行 唯一标识是namesapce.sqlId
//        int insert = session.insert("me.jackson.mybatis.pojo.mapper.UserMapper.insertUser");
//        System.out.println(insert);


        //提交会话
//        session.commit();
        //关闭sqlseesion 会话
        session.close();
    }

    @Test
    public void testUpdate(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        mapper.updateUser();
        sqlSession.commit();
        sqlSession.close();
    }
    @Test
    public void testDelete(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        mapper.deleteUser();
        sqlSession.commit();
        sqlSession.close();
    }
    @Test
    public void testSelectOne() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.getUserById();
        System.out.println(user);
    }
    @Test
    public void testAllUser() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> allUser = mapper.getAllUser();
        allUser.forEach(System.out::println);
    }
}
