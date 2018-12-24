package com.example.demo;

import com.example.demo.entity.user.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
@RestController
public class DemoApplication {

    public static void main(String[] args) {
        User user = new User();
        user.setUsername("1");
        user.setPassword("1");
        User user1 = new User();
        user1.setUsername("1");
        user1.setPassword("2");
        boolean a = user.equals(user1);
        Map<Integer,User> map = new HashMap<>();
        map.put(1,user);
        boolean p = map.containsValue(user1);




        SpringApplication.run(DemoApplication.class, args);
    }
}
