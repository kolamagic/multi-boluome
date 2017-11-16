/*
 * Copyright (c) 2017. Rio Hwang Products. All rights reserved.
 */

package iflyer.web;

import iflyer.IflyerApplication;
//import iflyer.dao.UserDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = IflyerApplication.class)
public class IflyerApplicationTest {

    @Autowired
    //UserDao userDao;
            JdbcTemplate jdbcTemplate;
    //DataSource dataSource;

    @Test
    public void getUser() throws Exception {
        //System.out.println("userDao=" + userDao);
        //System.out.println(userDao.getUser("liuixn").getName());
        //System.out.println("jdbcTemplate=" + jdbcTemplate);
        //System.out.println("dataSource=" + jdbcTemplate.getDataSource());
        //System.out.println("dataSource=" + dataSource);
    }
}
