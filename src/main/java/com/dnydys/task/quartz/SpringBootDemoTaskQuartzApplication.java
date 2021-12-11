package com.dnydys.task.quartz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * <p>
 * 启动器
 * </p>
 *
 * @author dnydys
 * @date Created in 2021-12-11 23:48
 */
@MapperScan(basePackages = {"com.dnydys.task.quartz.mapper"})
@SpringBootApplication
public class SpringBootDemoTaskQuartzApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootDemoTaskQuartzApplication.class, args);
    }
}
