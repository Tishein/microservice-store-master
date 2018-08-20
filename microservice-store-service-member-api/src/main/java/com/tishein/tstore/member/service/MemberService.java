package com.tishein.tstore.member.service;

import com.tishein.tstore.common.base.service.BaseService;
import com.tishein.tstore.domain.Member;
import com.tishein.tstore.member.service.hystrix.MemberServiceHystrix;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @Author Administrator
 * @Description 用户业务逻辑层
 * @Date 9:44 2018/8/15 0017
 **/
@FeignClient(value = "microservice-store-service-member", path = "/member", fallback = MemberServiceHystrix.class)
public interface MemberService extends BaseService<Member> {

}
