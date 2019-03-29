package com.wechat.demo.usercenter.modular.server.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.wechat.demo.usercenter.modular.server.domain.Article;
import com.wechat.demo.usercenter.modular.server.service.IUserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IUserService {

    @Override
    public JSONObject findBonusLogsByUserId(Integer wxUserId) {
        return null;
    }

    @Override
    public JSONObject signByUserId(Integer userId) {
        return null;
    }
}
