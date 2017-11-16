/*
 * Copyright (c) 2017. Rio Hwang Products. All rights reserved.
 */

package iflyer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
//@EnableAutoConfiguration//(exclude = DataSourceAutoConfiguration.class)
//@ComponentScan(basePackages = "iflyer")

public class IflyerApplication {

    public static void main(String[] args) {

        SpringApplication.run(IflyerApplication.class, args);
    }

}
