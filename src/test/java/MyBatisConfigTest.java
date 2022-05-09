import com.win.ssm.config.JdbcConfig;
import com.win.ssm.config.MyBatisConfig;
import com.win.ssm.dao.BookMapper;
import com.win.ssm.pojo.Book;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.sql.DataSource;
import java.math.BigDecimal;
import java.util.List;

/**
 * @Desc:
 * @Author: PEACEMAKER
 * @Date: 2022/5/7
 */
@Slf4j
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {JdbcConfig.class,MyBatisConfig.class})
public class MyBatisConfigTest {
    @Autowired
    private DataSource dataSource;
    @Autowired
    private SqlSessionFactoryBean sqlSessionFactoryBean;

    @Test
    public void testQueryAll() throws Exception {
        sqlSessionFactoryBean.setDataSource(dataSource);
        BookMapper mapper = sqlSessionFactoryBean.getObject().openSession().getMapper(BookMapper.class);
        List<Book> books = mapper.queryAll();
        books.forEach(book -> {
            System.out.println(book);
        });
    }

    @Test
    public void testQueryOne() throws Exception {
        sqlSessionFactoryBean.setDataSource(dataSource);
        BookMapper mapper = sqlSessionFactoryBean.getObject().openSession().getMapper(BookMapper.class);
        Book book = mapper.queryByName("《高等数学》");
        System.out.println(book);
    }

    @Test
    public void testQueryCount() throws Exception {
        sqlSessionFactoryBean.setDataSource(dataSource);
        BookMapper mapper = sqlSessionFactoryBean.getObject().openSession().getMapper(BookMapper.class);
        Integer integer = mapper.queryCount();
        System.out.println(integer);

    }

    @Test
    public void testInsertOne() throws Exception {
        sqlSessionFactoryBean.setDataSource(dataSource);
        BookMapper mapper = sqlSessionFactoryBean.getObject().openSession().getMapper(BookMapper.class);
        Integer i = mapper.insertOne(new Book(null,"《权利游戏》", new BigDecimal("56.3"), "张杰", 330, 253, "a.jpg"));
        System.out.println(i);
    }


    @Test
    public void testDeleteByName() throws Exception {
        sqlSessionFactoryBean.setDataSource(dataSource);
        BookMapper mapper = sqlSessionFactoryBean.getObject().openSession().getMapper(BookMapper.class);
        Integer integer = mapper.deleteByName("《王》");
        System.out.println(integer);
    }

    @Test
    public void testUpdate() throws Exception {
        sqlSessionFactoryBean.setDataSource(dataSource);
        BookMapper mapper = sqlSessionFactoryBean.getObject().openSession().getMapper(BookMapper.class);
        // Map<String,Object> map=new HashMap<>();
        // map.put("price",89);
        // map.put("name","《高等数学》");
        // Integer integer = mapper.updateOne(map);
        // System.out.println(integer);
        Integer integer = mapper.updateOne(new Book(62,"《王》", new BigDecimal("56.3"), "张杰", 330, 253,null));
        System.out.println(integer);
    }
}
