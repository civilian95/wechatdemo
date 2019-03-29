package com.wechat.demo.usercenter.modular.server.domain;

public class Bonus {

    private Integer id;

    private Integer wxUserId;

    private Integer bonus;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getWxUserId() {
        return wxUserId;
    }

    public void setWxUserId(Integer wxUserId) {
        this.wxUserId = wxUserId;
    }

    public Integer getBonus() {
        return bonus;
    }

    public void setBonus(Integer bonus) {
        this.bonus = bonus;
    }
}
