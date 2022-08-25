import me.jackson.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

/**
 * @author Jackson Chen
 * @version 1.0
 * @date 2022/8/21
 */
public class SqlSessionTest {
    @Test
    public void testGetSqlSession(){
        SqlSession session = SqlSessionUtil.getSqlSession();
        System.out.println(session);
    }
}
