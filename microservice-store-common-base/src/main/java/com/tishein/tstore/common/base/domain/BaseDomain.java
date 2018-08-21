package com.tishein.tstore.common.base.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

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

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createDate;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date modifyDate;

    public BaseDomain() {
    }

    public BaseDomain(ID id) {
        this.id = id;
    }
}
