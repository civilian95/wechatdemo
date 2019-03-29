package com.wechat.demo.usercenter.modular.server.controller;

import com.alibaba.fastjson.JSONObject;
import com.wechat.demo.usercenter.modular.server.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private IUserService userService;

    @RequestMapping(value = "/bonus-logs", produces = "application/json")
    public JSONObject findBonusLogsByUserId(@RequestBody Integer userId) {
        return userService.findBonusLogsByUserId(userId);
    }

    @RequestMapping(value = "/sign", produces = "application/json")
    public JSONObject signByUserId(@RequestBody Integer userId) {
        return userService.signByUserId(userId);
    }

    @RequestMapping(value = "/me", produces = "application/json")
    public JSONObject contributions() {
        return null;
    }

    @RequestMapping(value = "/complete", produces = "application/json")
    public JSONObject complete() {
        return null;
    }


}
