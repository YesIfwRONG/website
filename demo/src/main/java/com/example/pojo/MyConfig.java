package com.example.pojo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "user")
@PropertySource(value = "classpath:MyConfig.properties")
public class MyConfig {
    public String username;
    public Integer age;
    public String sex;

//    public MyConfig(String name, Integer age, String sex) {
//        this.name = name;
//        this.age = age;
//        this.sex = sex;
//    }


    public String getUsername() {
        return username;
    }

    public Integer getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
