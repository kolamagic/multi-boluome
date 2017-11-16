/*
 * Copyright (c) 2017. Rio Hwang Products. All rights reserved.
 */

package iflyer.dao;

import iflyer.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.stereotype.Component;


@Component
public class UserDao {

    //@Autowired
    JdbcTemplate jdbcTemplate;

    public User getUser(String name) {
        User temp;
        try {
            temp = jdbcTemplate.queryForObject(
                    "select id, name, age from tb_user where name = ?",
                    new Object[]{name},
                    User.class);
        } catch (Exception ex) {
            temp = null;
            ex.printStackTrace();
        }
        return temp;
    }


    public User saveUser(String name, int age) {
        GeneratedKeyHolder keyHolder = new GeneratedKeyHolder();
        jdbcTemplate.update(
                "insert into tb_user (name, age) values (?, ?)",
                new Object[] { name, age }, keyHolder);
        return  new User(keyHolder.getKey().intValue(), name, age);
    }
}
