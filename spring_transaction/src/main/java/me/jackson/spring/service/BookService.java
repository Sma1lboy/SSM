package me.jackson.spring.service;

/**
 * @author Jackson Chen
 * @version 1.0
 * @date 2022/9/1
 */
public interface BookService {
    /**
     * 买书操作
     * @param id
     * @param bookId
     */
    void buyBook(Integer id, Integer bookId);

}
