package br.com.emmanuelneri;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {AppConfig.class, HikariConfiguration.class})
@Slf4j
public class HikariSourceTest extends PerformanceUseCase {

    @Autowired
    private DataSource dataSource;

    @Test
    @Sql("/reset-db.sql")
    public void hikariCpTest() {
       log.info("DataSource: " + dataSource);
       runUseCase();
    }

}
