package com.example.controller;

import com.example.pojo.MyConfig;
import com.example.pojo.Stu;
import com.example.pojo.Student;
import com.example.utils.JSONResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;

@RestController
@Slf4j
public class HelloController {
    @GetMapping("hello")
    public String hello(){
        return "Hello World! ";
    }

    @Autowired
    private Stu stu;

    @GetMapping("getStu")
    public Object getStu() {
        return stu;
    }

    @Autowired
    private MyConfig myConfig;

    @GetMapping("getMyConfig")
    public Object getMyConfig(){
        return myConfig;
    }

    @GetMapping("getStudent")
    public JSONResult getStudent() {
        Student stu = new Student();
        stu.setName("serena");
        stu.setAge(19);

        System.out.println(stu.toString());

        log.debug(stu.toString());
        log.info(stu.toString());
        log.warn(stu.toString());
        log.error(stu.toString());

        return JSONResult.ok(stu);
    }

    @PostMapping("upload")
    public String upload(MultipartFile file) throws Exception{
        file.transferTo(new File("C:\\Users\\chenyirong02\\Documents\\java-web" + file.getOriginalFilename()));
        return "Upload successfully. ";
    }
}
