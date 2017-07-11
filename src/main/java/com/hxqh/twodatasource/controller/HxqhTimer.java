package com.hxqh.twodatasource.controller;

import com.hxqh.twodatasource.service.SystemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.lang.reflect.InvocationTargetException;

/**
 * Created by Ocean lin on 2017/7/9.
 */
//@Component
public class HxqhTimer {

    @Autowired
    private SystemService systemService;

    //每5分钟执行一次
    @Scheduled(fixedRate = 2*60*1000)
    public void openStreetMap() {
        try {
            systemService.openStreetMap();
        } catch (InvocationTargetException e) {
            //TODO 日志功能
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }




    //每天早八点到晚八点，间隔2分钟执行任务
    @Scheduled(cron="0 0/5 8-20 * * ?")
    public void exec() {

    }


}
