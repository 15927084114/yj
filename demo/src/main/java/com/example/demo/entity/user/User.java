package com.example.demo.entity.user;

import lombok.Data;

@Data
public class User {
    private  String username;
    private String password;

    @Override
    public boolean equals(Object o){
        if (o != null){
            if (o.getClass().equals(this.getClass())){
                if (((User) o).getUsername().equals(this.getUsername())) {
                    return true;
                }
            }
        }
        return false;
    }


    public enum Role{
        ADMIN("1","ADMIN"),USER1("2","USER1");

        String code;
        String name;
        Role(String code,String name){
            this.code=code;
            this.name=name;
        }
    }
}
