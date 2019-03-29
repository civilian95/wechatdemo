package com.wechat.demo.contentcenter.modular.server.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.wechat.demo.contentcenter.modular.server.domain.Article;
import com.wechat.demo.contentcenter.modular.server.service.IPostService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class PostServiceImpl implements IPostService {

    @Override
    public List<Article> findShares(String pageNo, String title) {
        List<Article> articles = new ArrayList<>();
        Article article = null;
        for (int i = 1; i < 3; i++) {
            article = new Article();
            article.setId(Integer.toString(i));
            article.setAuthor("wry");
            article.setTitle("test title");
            article.setSummary("summary");
            article.setUserId("2333" + i);
            article.setPrice(2333);
            article.setBuyCount(998);
            article.setCover("imgs/cover.jpeg");
            article.setShow(true);
            article.setOriginal(true);
            article.setType("share");
            article.setAuditStatus("1");
            article.setDownloadUrl("https://baidu.com");
            article.setReason(" ");
            article.setCreateTime(new Date());
            article.setUpdateTime(new Date());
            articles.add(article);
        }
        return articles;
    }

    @Override
    public Article findShareInfoById(String id) {
        Article article = new Article();
        article.setId(id);
        article.setAuthor("wry");
        article.setTitle("test title");
        article.setSummary("summary");
        article.setUserId(id);
        article.setPrice(2333);
        article.setBuyCount(998);
        article.setCover("imgs/cover.jpeg");
        article.setShow(true);
        article.setOriginal(true);
        article.setType("share");
        article.setAuditStatus("1");
        article.setDownloadUrl("https://baidu.com");
        article.setReason(" ");
        article.setCreateTime(new Date());
        article.setUpdateTime(new Date());
        return article;
    }


    @Override
    public JSONObject contribution(Article article) {
        JSONObject json = new JSONObject();
        json.put("status", 200);
        json.put("msg", 200);
        return json;
    }
}
