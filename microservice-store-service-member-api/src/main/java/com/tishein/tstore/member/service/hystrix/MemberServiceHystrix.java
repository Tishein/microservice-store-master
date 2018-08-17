package com.tishein.tstore.member.service.hystrix;

import com.tishein.tstore.common.service.hystrix.BaseServiceHystrix;
import com.tishein.tstore.domain.Member;
import com.tishein.tstore.member.service.MemberService;
import org.springframework.stereotype.Component;

@Component
public class MemberServiceHystrix extends BaseServiceHystrix<Member> implements MemberService {

}
