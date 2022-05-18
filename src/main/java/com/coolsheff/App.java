package com.coolsheff;

import com.coolsheff.dao.Entity;
import com.coolsheff.repository.EntityRepository;
import org.h2.tools.Console;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.sql.SQLException;
import java.util.List;

@SpringBootApplication
public class App {
    public static void main(String[] args) {

        ConfigurableApplicationContext context = SpringApplication.run(App.class, args);

        List<Entity> entityList = context.getBean(EntityRepository.class).findAll();
        entityList.stream().forEach(System.out::println);
//        try {
//            Console.main(args);
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
    }
}
