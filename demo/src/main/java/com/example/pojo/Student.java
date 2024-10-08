package com.example.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data       // 生成get和set方法
@ToString   // 生成toString方法
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    public String name;
    public Integer age;
}
