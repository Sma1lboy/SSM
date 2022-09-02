package me.jackson.spring.dao;

/**
 * @author Jackson Chen
 * @version 1.0
 * @date 2022/9/1
 */
public interface BookDAO {
    /**
     * 获取图书的价格
     * @param bookId
     * @return
     */
    Integer getPriceByBookId(Integer bookId);


    /**
     * 更新图书库存
     * @param bookId
     */
    void updateStock(Integer bookId);
}
