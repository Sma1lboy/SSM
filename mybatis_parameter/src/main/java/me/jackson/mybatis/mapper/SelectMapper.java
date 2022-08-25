package me.jackson.mybatis.mapper;

import me.jackson.mybatis.pojo.User;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * @author Jackson Chen
 * @version 1.0
 * @date 2022/8/23
 */
public interface SelectMapper {
    User getUserById(@Param("id") Integer id);

    List<User> getAllUsers();

    Integer getCount();

    /**
     * Get user info by id return to map<K, V>
     * @param id
     * @return
     */
    Map<String, Object> getUserByIdToMap(@Param("id") Integer id);

    /**
     * Get all users info by id return to map<K, V>.
     * 若查询的数据有多条时，并且要将每条数据转换为map集合
     * 此时有两种解决方案
     * 1. 将mapper接口方法的返回值设置为范型时map的list集合
     * List<Map<String, Object>> getAllUsersToMap()
     * 2. 可以将每条数据转换的map集合 放在一个大的map集合当中, 但是必须通过@MapKey注解
     * @MapKey("id")
     * Map<String, Object> getAllUsersToMap();
     *
     * @return
     */
    @MapKey("id")
    Map<String, Object> getAllUsersToMap();
}
