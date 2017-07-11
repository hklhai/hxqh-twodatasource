package com.hxqh.twodatasource.controller;

import com.hxqh.twodatasource.service.SystemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Ocean lin on 2017/7/1.
 */
@Controller
@RequestMapping("/system")
public class SystemController {

    @Autowired
    private SystemService systemService;


    /**
     * 页面跳转接口
     *
     * @return
     */
    @RequestMapping("/user")
    public String user() {
        return "user/index";
    }

//    /**
//     * 数据接口
//     * http://127.0.0.1:8080/system/userData?name=xdm
//     *
//     * @param name 用户名
//     * @return
//     */
//    @RequestMapping("userData")
//    @ResponseBody
//    public PrimaryUser userData(@RequestParam(value = "name") String name) {
//        return systemService.findUserById(name);
//    }


}
