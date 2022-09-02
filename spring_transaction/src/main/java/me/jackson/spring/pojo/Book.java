package me.jackson.spring.pojo;

import org.springframework.stereotype.Component;

/**
 * @author Jackson Chen
 * @version 1.0
 * @date 2022/9/1
 */
@Component
public class Book {
    private Integer bookId;
    private String bookName;
    private Integer price;
    private Integer stock;

    public Book() {
    }

    public Book(Integer bookId, String bookName, Integer price, Integer stock) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.price = price;
        this.stock = stock;
    }

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }
}
