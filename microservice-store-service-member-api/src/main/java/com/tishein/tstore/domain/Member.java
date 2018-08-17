package com.tishein.tstore.domain;


import lombok.Data;

import java.util.Date;

/**
 * @ClassName Member
 * @Description TODO
 * @Author Administrator
 * @Date 2018/8/16 0016 13:40
 */
@Data
public class Member extends BaseDomain {

    private String nickname;

    private String username;

    private String password;

    private String secretKey;

    private Date lastLoginDate;

    private String email;

    private Integer status;

}