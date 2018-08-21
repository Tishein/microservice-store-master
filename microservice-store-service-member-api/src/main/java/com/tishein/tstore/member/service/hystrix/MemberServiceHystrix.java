package com.tishein.tstore.member.service.hystrix;

import com.tishein.tstore.domain.Member;
import com.tishein.tstore.member.service.MemberService;
import org.springframework.stereotype.Component;
import com.tishein.tstore.common.base.service.hystrix.BaseServiceHystrix;

@Component
public class MemberServiceHystrix extends BaseServiceHystrix<Member, String> implements MemberService {

}
