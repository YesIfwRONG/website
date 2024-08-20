package com.example.pojo;

import org.springframework.stereotype.Component;

@Component
public class Stu {
    public String name;
    public Integer age;

    public Stu(String name, Integer age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
