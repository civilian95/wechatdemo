package com.wechat.demo.contentcenter.modular.server.controller;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.wechat.demo.contentcenter.modular.server.domain.Article;
import com.wechat.demo.contentcenter.modular.server.service.IPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/posts/shares")
public class PostController {

    @Autowired
    IPostService postService;

    @GetMapping(value = "/q")
    public JSONObject shares(@RequestParam String pageNo, @RequestParam String title) {
        List<Article> articles = postService.findShares(pageNo, title);

        JSONArray contentJson = new JSONArray();
        contentJson.addAll(articles);

        JSONObject pageAbleJson = new JSONObject();
        JSONObject sortJson = new JSONObject();
        sortJson.put("unsorted", false);
        sortJson.put("sorted", true);
        sortJson.put("empty", false);
        pageAbleJson.put("sort", sortJson);
        pageAbleJson.put("pageSize", 10);
        pageAbleJson.put("offset", 20);
        pageAbleJson.put("paged", true);
        pageAbleJson.put("unpaged", false);

        JSONObject dataJson = new JSONObject();
        dataJson.put("content", contentJson);
        dataJson.put("pageable", pageAbleJson);
        dataJson.put("totalPages", 3);
        dataJson.put("totalElements", 24);
        dataJson.put("last", true);
        dataJson.put("first", false);
        dataJson.put("sort", sortJson);
        dataJson.put("numberOfElement", 4);
        dataJson.put("size", 10);
        dataJson.put("number", 2);
        dataJson.put("empty", false);

        JSONObject resultJson = new JSONObject();
        resultJson.put("status", 200);
        resultJson.put("msg", "成功");
        resultJson.put("data", dataJson);

        return resultJson;
    }

    @RequestMapping(value = "/preview", produces = "application/json")
    public JSONObject preview() {
        return null;
    }

    @RequestMapping(value = "/{id}", produces = "application/json")
    public JSONObject findShareInfoById(@PathVariable String id) {
        Article article = postService.findShareInfoById(id);

        JSONObject resultJson = new JSONObject();
        resultJson.put("status", 200);
        resultJson.put("msg", "成功");
        resultJson.put("data", article);
        return resultJson;
    }

    @RequestMapping(value = "/contribute", produces = "application/json")
    public JSONObject contribution(@RequestBody Article article) {
        return postService.contribution(article);
    }
}
