package com.wechat.demo.contentcenter.modular.server.service;

import com.alibaba.fastjson.JSONObject;
import com.wechat.demo.contentcenter.modular.server.domain.Article;

import java.util.List;

public interface IPostService {

    List<Article> findShares(String pageNo, String title);

    Article findShareInfoById(String id);

    JSONObject contribution(Article article);
}
