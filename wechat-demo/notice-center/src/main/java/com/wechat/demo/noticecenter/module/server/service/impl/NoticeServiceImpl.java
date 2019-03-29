package com.wechat.demo.noticecenter.module.server.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.wechat.demo.noticecenter.module.server.domain.Notice;
import com.wechat.demo.noticecenter.module.server.service.INoticeService;
import org.springframework.stereotype.Service;

@Service
public class NoticeServiceImpl implements INoticeService {
    @Override
    public JSONObject getNewest() {
        JSONObject json = new JSONObject();
        Notice notice = new Notice();
        notice.setId(1234);
        notice.setContent("写个demo");
        notice.setShow(true);
//        JSONObject dataJson = new JSONObject();
//        dataJson.put("id", 12345);
//        dataJson.put("content", "写个demo");
//        dataJson.put("show", true);

        json.put("data", notice);
        json.put("msg", "成功");
        json.put("status", 200);
        return json;
    }

}
