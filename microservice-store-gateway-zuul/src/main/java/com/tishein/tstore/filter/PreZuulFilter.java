package com.tishein.tstore.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

/**
 * @ClassName PreZuulFilter
 * @Description TODO
 * @Author Administrator
 * @Date 2018/8/21 0021 9:53
 */
@Slf4j
@Component
public class PreZuulFilter extends ZuulFilter {

    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 10;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        HttpServletRequest httpServletRequest = RequestContext.getCurrentContext().getRequest();
        log.info(httpServletRequest.getRequestURI());
        return null;
    }
}
