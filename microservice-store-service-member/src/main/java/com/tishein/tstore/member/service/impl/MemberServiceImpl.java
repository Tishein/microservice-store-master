package com.tishein.tstore.member.service.impl;

import com.tishein.tstore.common.base.service.impl.BaseServiceImpl;
import com.tishein.tstore.domain.Member;
import com.tishein.tstore.member.service.MemberService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @ClassName MemberServiceImpl
 * @Description 用户业务逻辑层
 * @Author Administrator
 * @Date 2018/8/16 0016 14:34
 */
@RestController
@RequestMapping("/member")
public class MemberServiceImpl extends BaseServiceImpl<Member> implements MemberService {

}
