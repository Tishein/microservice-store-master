package com.tishein.tstore.common.service.hystrix;

import com.github.pagehelper.PageInfo;
import com.tishein.tstore.common.service.BaseService;
import com.tishein.tstore.domain.BaseDomain;

import java.util.List;

/**
 * @ClassName BaseServiceHystrix
 * @Description 服务熔断
 * @Author Administrator
 * @Date 2018/8/17 0017 9:45
 */
public class BaseServiceHystrix<T extends BaseDomain> implements BaseService<T> {

    @Override
    public List<T> list(T domain) {
        return null;
    }

    @Override
    public PageInfo<T> list(T domain, Integer pageNum, Integer pageSize) {
        return null;
    }

    @Override
    public T get(String id) {
        return null;
    }

    @Override
    public int insert(T domain) {
        return 0;
    }

    @Override
    public int update(T domain) {
        return 0;
    }

    @Override
    public int delete(String id) {
        return 0;
    }

    @Override
    public int deleteLogic(String id) {
        return 0;
    }

    @Override
    public int insertBatch(List<T> domains) {
        return 0;
    }

    @Override
    public int updateBatch(List<T> domains) {
        return 0;
    }

    @Override
    public int deleteBatch(List<T> domains) {
        return 0;
    }

    @Override
    public int deleteLogicBatch(List<T> domains) {
        return 0;
    }
}
