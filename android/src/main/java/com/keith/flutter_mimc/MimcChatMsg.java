package com.keith.flutter_mimc;

public class MimcChatMsg {
    private String bizType;
    private String fromAccount;
    private MimcMsg msg;
    private Boolean isSingle;

    public MimcChatMsg() {}

    public MimcChatMsg(String bizType, String fromAccount, MimcMsg msg, Boolean isSingle) {
        this.bizType = bizType;
        this.fromAccount = fromAccount;
        this.msg = msg;
        this.isSingle = isSingle;
    }

    public String getBizType() {
        return bizType;
    }

    public void setBizType(String bizType) {
        this.bizType = bizType;
    }

    public String getFromAccount() {
        return fromAccount;
    }

    public void setFromAccount(String fromAccount) {
        this.fromAccount = fromAccount;
    }

    public MimcMsg getMsg() {
        return msg;
    }

    public void setMsg(MimcMsg msg) {
        this.msg = msg;
    }

    public Boolean getSingle() {
        return isSingle;
    }

    public void setSingle(Boolean single) {
        isSingle = single;
    }
}
