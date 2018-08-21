package com.tishein.tstore.common.base.service.hystrix;

import com.github.pagehelper.PageInfo;
import com.tishein.tstore.common.base.service.BaseService;
import com.tishein.tstore.common.base.domain.BaseDomain;
import com.tishein.tstore.common.utils.Result;

import java.util.List;

/**
 * @ClassName BaseServiceHystrix
 * @Description 服务熔断
 * @Author Administrator
 * @Date 2018/8/17 0017 9:45
 */
public class BaseServiceHystrix<T extends BaseDomain, ID> implements BaseService<T, ID> {


    @Override
    public Result<List<T>> list(T domain) {
        return Result.error();
    }

    @Override
    public Result<PageInfo<T>> list(T domain, Integer pageNum, Integer pageSize) {
        return Result.error();
    }

    @Override
    public Result<T> get(ID id) {
        return Result.error();
    }

    @Override
    public Result<T> insert(T domain) {
        return Result.error();
    }

    @Override
    public Result<T> update(T domain) {
        return Result.error();
    }

    @Override
    public Result<T> delete(ID id) {
        return Result.error();
    }

    @Override
    public Result<T> deleteLogic(ID id) {
        return Result.error();
    }

    @Override
    public Result<T> insertBatch(List<T> domains) {
        return Result.error();
    }

    @Override
    public Result<T> updateBatch(List<T> domains) {
        return Result.error();
    }

    @Override
    public Result<T> deleteBatch(List<T> domains) {
        return Result.error();
    }

    @Override
    public Result<T> deleteLogicBatch(List<T> domains) {
        return Result.error();
    }
}
