package com.wechat.demo.usercenter.modular.server.service;

import com.alibaba.fastjson.JSONObject;
import com.wechat.demo.usercenter.modular.server.domain.Article;

public interface IUserService {

    JSONObject findBonusLogsByUserId(Integer wxUserId);

    JSONObject signByUserId(Integer userId);
}
