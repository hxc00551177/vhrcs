package org.aoligei.vhrcs.model.entity;

import java.io.Serializable;

/**
 * (ArticleTags)实体类
 *
 * @author makejava
 * @since 2020-08-06 14:39:03
 */
public class ArticleTags implements Serializable {
    private static final long serialVersionUID = -61478377879990543L;

    private Integer id;

    private Integer aid;

    private Integer tid;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

}