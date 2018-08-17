package com.tishein.tstore.domain;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @Author Stishein
 * @Description 基础实体类
 * @Date 17:16 2018/8/15 0015
 **/
@Data
public class BaseDomain implements Serializable {

    private String id;

    private String code;

    private Date createDate;

    private Date modifyDate;

    public BaseDomain() {
    }

    public BaseDomain(String id) {
        this.id = id;
    }
}
