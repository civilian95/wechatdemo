package com.wechat.demo.logincenter.module.server.controller;

import com.alibaba.fastjson.JSONObject;
import com.wechat.demo.logincenter.module.server.domain.WechatUser;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class LoginController {

    @RequestMapping(value = "/miniapp", produces = "application/json")
    public JSONObject login(@RequestBody WechatUser user) {
        JSONObject json = new JSONObject();
        json.put("status", 200);
        json.put("msg", "成功");
        return json;
    }
}
