/*
 * Copyright (c) 2017. Rio Hwang Products. All rights reserved.
 */

package iflyer.web;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

//@Configuration
//@EnableTransactionManagement
public class JpaConfiguration {

    //@Bean//(destroyMethod = "close")
    public DataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/flatify");
        dataSource.setUsername("user");
        dataSource.setPassword("password");

        return dataSource;
    }
}
