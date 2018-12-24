package com.example.demo.entity.filter;

import com.example.demo.entity.user.User;

import java.lang.annotation.*;
import java.util.List;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Authority {
    String code();
    String name();

    User.Role[] roles() default {User.Role.ADMIN};

}
