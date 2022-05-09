import com.win.ssm.config.JdbcConfig;
import com.win.ssm.config.MyBatisConfig;
import com.win.ssm.config.SpringConfig;
import com.win.ssm.pojo.Book;
import com.win.ssm.service.BookServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.math.BigDecimal;
import java.util.List;

/**
 * @Desc:
 * @Author: PEACEMAKER
 * @Date: 2022/5/7
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {JdbcConfig.class, MyBatisConfig.class, SpringConfig.class})
public class BookServiceTest {

    @Autowired
    private BookServiceImpl bookServiceImpl;

    @Test
    public void testQueryAll(){
        List<Book> books = bookServiceImpl.queryAll();
        books.forEach(book -> {
            System.out.println(book);
        });
    }

    @Test
    public void testQueryByName() {
        Book book = bookServiceImpl.queryByName("《高等数学》");
        System.out.println(book);
    }

    @Test
    public void testInsertBook() {
        Integer i = bookServiceImpl.insertOne(new Book(null, "《王》", new BigDecimal("78.9"), "张三", 5511, 544, null));
        System.out.println(i);
    }

    @Test
    public void testUpdateBook() {
        Integer integer = bookServiceImpl.updateOne(new Book(62, "《王》", new BigDecimal("25.9"), "张三", 5511, 544, null));
        System.out.println(integer);
    }
}
