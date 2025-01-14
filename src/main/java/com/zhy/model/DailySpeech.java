package com.zhy.model;

import lombok.Data;

import java.util.Date;

/**
 * @author: zhangocean
 * @Date: 2018/11/28 15:01
 * Describe:
 */

public class DailySpeech {

    /**
     * 每天说的话
     */
    private String content;

    /**
     * 每天的心情
     */
    private String mood;

    /**
     * 图片url拼接后的字符串
     */
    private String picsUrl;

    /**
     * 发布日期
     */
    private Date publishDate;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getMood() {
        return mood;
    }

    public void setMood(String mood) {
        this.mood = mood;
    }

    public String getPicsUrl() {
        return picsUrl;
    }

    public void setPicsUrl(String picsUrl) {
        this.picsUrl = picsUrl;
    }

    public Date getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
    }
}
