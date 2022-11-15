package com.ibm.hkvision.demo;

public class ResBody {
    public String text;
    public Integer num;

    public String getText() {
        return text;
    }

    public ResBody setText(String text) {
        this.text = text;
        return this;
    }

    public Integer getNum() {
        return num;
    }

    public ResBody setNum(Integer num) {
        this.num = num;
        return this;
    }

    public ResBody() {
    }

    public ResBody(String text, Integer num) {
        this.text = text;
        this.num = num;
    }
}
