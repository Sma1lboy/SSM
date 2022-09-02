package me.jackson.spring.service.impl;

import me.jackson.spring.dao.BookDAO;
import me.jackson.spring.dao.UserDAO;
import me.jackson.spring.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Jackson Chen
 * @version 1.0
 * @date 2022/9/1
 */
@Service

public class BookServiceImpl implements BookService {
    @Autowired
    private BookDAO bookDAO;

    @Autowired
    private UserDAO userDAO;

    public BookDAO getBookDAO() {
        return bookDAO;
    }

    public void setBookDAO(BookDAO bookDAO) {
        this.bookDAO = bookDAO;
    }

    @Override
    @Transactional(
        propagation = Propagation.REQUIRES_NEW
    )
    public void buyBook(Integer id, Integer bookId) {
        //查询图书价格
        Integer price = bookDAO.getPriceByBookId(bookId);
        //更新图书库存
        bookDAO.updateStock(bookId);
        //更新用户余额
        userDAO.updateBalence(id, price);
    }


}
