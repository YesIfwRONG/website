package com.example.controller;

import com.example.pojo.MyConfig;
import com.example.pojo.Stu;
import com.example.pojo.Student;
import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("stu")
@Slf4j
public class StuController {
    @GetMapping("{stuId}/get")
    public String getStu(@PathVariable("stuId") String stuId,
                         @RequestParam Integer id,
                         @RequestParam String name) {

        // Example: localhost:8080/stu/888/get?id=1001&name=serena
        log.info("stuId=" + stuId);
        log.info("id=" + id);
        log.info("name=" + name);
        return "查询Stu";
    }

    @PostMapping("create")
    public String createStu(@RequestBody Map<String, Object> map,
                            @RequestHeader("token") String token,
                            @CookieValue("clientId") String clientId,
                            HttpServletRequest request){

        log.info("token="+token);
        log.info("clientId="+clientId);
        log.info("map="+map.toString());
        String headerToken = request.getHeader("token");
        log.info("headerToken="+headerToken);
        return "新增Stu";
    }

    @PutMapping("update")
    public String updateStu(){
        return "修改Stu";
    }

    @DeleteMapping("delete")
    public String deleteStu(){
        return "删除Stu";
    }


}
