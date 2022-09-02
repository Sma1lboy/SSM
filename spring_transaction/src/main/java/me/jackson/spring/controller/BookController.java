package me.jackson.spring.controller;

import me.jackson.spring.service.BookService;
import me.jackson.spring.service.CheckoutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @author Jackson Chen
 * @version 1.0
 * @date 2022/9/1
 */
@Controller
public class BookController {
    @Autowired
    private BookService bookService;

    @Autowired
    private CheckoutService checkoutService;

    public BookService getBookService() {
        return bookService;
    }

    public void setBookService(BookService bookService) {
        this.bookService = bookService;
    }

    public void buyBook(Integer id, Integer bookId){
        bookService.buyBook(id, bookId);
    }
    public void checkOut(Integer userId, Integer[] bookIds){
        checkoutService.checkout(userId, bookIds);
    }

}
