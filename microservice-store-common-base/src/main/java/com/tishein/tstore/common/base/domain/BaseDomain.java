package com.tishein.tstore.common.base.domain;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @Author Stishein
 * @Description 基础实体类
 * @Date 17:16 2018/8/15 0015
 **/
@Data
public class BaseDomain<ID> implements Serializable {

    private ID id;

    private String code;

    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date createDate;

    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date modifyDate;

    public BaseDomain() {
    }

    public BaseDomain(ID id) {
        this.id = id;
    }
}
