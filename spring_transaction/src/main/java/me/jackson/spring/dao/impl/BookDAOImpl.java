package me.jackson.spring.dao.impl;

import me.jackson.spring.dao.BookDAO;
import me.jackson.spring.pojo.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * @author Jackson Chen
 * @version 1.0
 * @date 2022/9/1
 */
@Repository
public class BookDAOImpl implements BookDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Override
    public Integer getPriceByBookId(Integer bookId) {
        String sql = "select * from t_book where book_id = ?";
        Book book = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(Book.class), bookId);
        return book.getPrice();
    }

    @Override
    public void updateStock(Integer bookId) {
        String sql = "update t_book set stock= stock - 1 where book_id = ?";
        jdbcTemplate.update(sql,bookId);
    }
}
