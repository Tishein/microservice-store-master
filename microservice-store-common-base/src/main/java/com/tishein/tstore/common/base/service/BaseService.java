package com.tishein.tstore.common.base.service;

import com.github.pagehelper.PageInfo;
import com.tishein.tstore.common.base.domain.BaseDomain;
import com.tishein.tstore.common.utils.Result;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author Stishein
 * @Description 基础业务逻辑处理层
 * @Date 17:13 2018/8/15 0015
 **/
public interface BaseService<T extends BaseDomain, ID>  {

    /**
     * @Author Stishein
     * @Description 通过参数条件查询数据，返回列表
     * @Date 17:45 2018/8/15 0015
     * @Param [domain]
     * @return java.util.List<com.tishein.tstore.domain.BaseDomain>
     **/
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    Result<List<T>> list(@ModelAttribute T domain);

    /**
     * @Author Stishein
     * @Description 通过参数条件分页查询数据，返回列表
     * @Date 9:57 2018/8/16 0016
     * @Param [domain, pageNum, pageSize]
     * @return com.github.pagehelper.PageInfo<T>
     **/
    @RequestMapping(value = "/list/{pageNum}/{pageSize}", method = RequestMethod.GET)
    Result<PageInfo<T>> list(
            @ModelAttribute           T       domain,
            @PathVariable("pageNum")  Integer pageNum,
            @PathVariable("pageSize") Integer pageSize
    );

    /**
     * @Author Stishein
     * @Description 通过id查询数据，返回一个结果
     * @Date 17:26 2018/8/15 0015
     * @Param [domain]
     * @return com.tishein.tstore.domain.BaseDomain
     **/
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    Result<T> get(@PathVariable("id") ID id);
    
    /**
     * @Author Stishein
     * @Description 插入数据
     * @Date 17:12 2018/8/15 0015
     * @Param [domain]
     * @return int
     **/
    @RequestMapping(value = "", method = RequestMethod.POST)
    Result<T> insert(@RequestBody T domain);

    /**
     * @Author Stishein
     * @Description 更新数据
     * @Date 17:15 2018/8/15 0015
     * @Param [domain]
     * @return int
     **/
    @RequestMapping(value = "", method = RequestMethod.PUT)
    Result<T> update(T domain);

    /**
     * @Author Stishein
     * @Description 删除数据
     * @Date 17:19 2018/8/15 0015
     * @Param [domain]
     * @return int
     **/
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    Result<T> delete(@PathVariable("id") ID id);

    /**
     * @Author Stishein
     * @Description 逻辑删除数据
     * @Date 17:25 2018/8/15 0015
     * @Param [domain]
     * @return int
     **/
    @RequestMapping(value = "/{id}/logic", method = RequestMethod.DELETE)
    Result<T> deleteLogic(@PathVariable("id") ID id);

    /**
     * @Author Stishein
     * @Description 批量插入数据
     * @Date 17:32 2018/8/15 0015
     * @Param [list]
     * @return int
     **/
    @RequestMapping(value = "/batch", method = RequestMethod.POST)
    Result<T> insertBatch(@RequestBody List<T> domains);
    
    /**
     * @Author Stishein
     * @Description 批量更新数据
     * @Date 17:33 2018/8/15 0015
     * @Param [domains]
     * @return int
     **/
    @RequestMapping(value = "/batch", method = RequestMethod.PUT)
    Result<T> updateBatch(@RequestBody List<T> domains);


    /**
     * @Author Stishein
     * @Description 批量删除数据
     * @Date 17:40 2018/8/15 0015
     * @Param [domains]
     * @return int
     **/
    @RequestMapping(value = "/batch", method = RequestMethod.DELETE)
    Result<T> deleteBatch(@RequestBody List<T> domains);

    /**
     * @Author Stishein
     * @Description 批量逻辑删除数据，返回数据列表
     * @Date 17:42 2018/8/15 0015
     * @Param [domains]
     * @return int
     **/
    @RequestMapping(value = "/batch/logic", method = RequestMethod.DELETE)
    Result<T> deleteLogicBatch(List<T> domains);
}
