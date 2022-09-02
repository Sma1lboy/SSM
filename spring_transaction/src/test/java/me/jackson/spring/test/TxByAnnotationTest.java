package me.jackson.spring.test;

import me.jackson.spring.controller.BookController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author Jackson Chen
 * @version 1.0
 * @date 2022/9/1
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:tx-annotation.xml")
public class TxByAnnotationTest {

    @Autowired
    private BookController bookController;
    @Test
    public void testTxByAnnotattion(){
        bookController.checkOut(1, new Integer[]{1,2 });
    }
}
