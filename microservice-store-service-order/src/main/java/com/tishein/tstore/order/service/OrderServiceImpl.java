package com.tishein.tstore.order.service;

import com.tishein.tstore.common.utils.Result;
import com.tishein.tstore.domain.Member;
import com.tishein.tstore.member.service.MemberService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


/**
 * @ClassName MemberServiceImpl
 * @Description 用户业务逻辑层
 * @Author Administrator
 * @Date 2018/8/16 0016 14:34
 */
@Slf4j
@RestController
@RequestMapping("/order")
public class OrderServiceImpl {

    @Autowired
    private MemberService memberService;


    @GetMapping("/member/{id}")
    public Result<Member> getMember(@PathVariable("id") String id) {
        return memberService.get(id);
    }

}
