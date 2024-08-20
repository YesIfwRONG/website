package com.example.utils;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
* cron 时间来设置task，同时还可以用类似此file达成异步；
 */
@Configuration
@EnableScheduling
public class MyTask {
}
