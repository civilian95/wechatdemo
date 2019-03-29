package com.wechat.demo.noticecenter.module.server.controller;

import com.wechat.demo.noticecenter.module.server.service.INoticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/notices")
public class NoticeController {

    @Autowired
    private INoticeService noticeService;

    @RequestMapping(value = "/newest", produces = "application/json")
    public Object getNewest() {
        return noticeService.getNewest();
    }


}
