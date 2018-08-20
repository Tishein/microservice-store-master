package com.tishein.tstore.common.base.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.tishein.tstore.common.base.mapper.BaseMapper;
import com.tishein.tstore.common.base.service.BaseService;
import com.tishein.tstore.common.base.domain.BaseDomain;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Date;
import java.util.List;

/**
 * @ClassName BaseServiceImpl
 * @Description 基础业务逻辑处理层实现
 * @Author Stishein
 * @Date 2018/8/15 0015 17:57
 */
@Slf4j
public class BaseServiceImpl<T extends BaseDomain> implements BaseService<T> {

    @Autowired
    protected BaseMapper<T> mapper;


    /**
     * @return java.util.List<com.tishein.tstore.domain.BaseDomain>
     * @Author
     * @Description Stishein
     * @Date 17:45 2018/8/15 0015
     * @Param [domain]
     **/
    @Override
    public List<T> list(T domain) {
        return mapper.list(domain);
    }

    /**
     * @return com.github.pagehelper.PageInfo<T>
     * @Author Stishein
     * @Description 通过参数条件分页查询数据，返回列表
     * @Date 9:57 2018/8/16 0016
     * @Param [domain, pageNum, pageSize]
     **/
    @Override
    public PageInfo<T> list(T domain,
            @PathVariable("pageNum")    Integer pageNum,
            @PathVariable("pageSize")   Integer pageSize
    ) {
        PageHelper.startPage(pageNum, pageSize);
        List<T> domains = mapper.list(domain);
        return new PageInfo<>(domains);
    }

    /**
     * @return com.tishein.tstore.domain.BaseDomain
     * @Author Stishein
     * @Description 通过id查询数据，返回一个结果
     * @Date 17:26 2018/8/15 0015
     * @Param [domain]
     **/
    @Override
    public T get(@PathVariable("id") String id) {
        return mapper.get(new BaseDomain(id));
    }

    /**
     * @return int
     * @Author Stishein
     * @Description 插入数据
     * @Date 17:12 2018/8/15 0015
     * @Param [domain]
     **/
    @Override
    public int insert(@RequestBody T domain) {
        domain.setCreateDate(new Date());
        return mapper.insert(domain);
    }

    /**
     * @return int
     * @Author Stishein
     * @Description 更新数据
     * @Date 17:15 2018/8/15 0015
     * @Param [domain]
     **/
    @Override
    public int update(@RequestBody T domain) {
        domain.setModifyDate(new Date());
        return mapper.update(domain);
    }

    /**
     * @return int
     * @Author Stishein
     * @Description 逻辑删除数据
     * @Date 17:25 2018/8/15 0015
     * @Param [domain]
     **/
    @Override
    public int delete(@PathVariable("id") String id) {
        return mapper.delete(new BaseDomain(id));
    }

    /**
     * @return int
     * @Author Stishein
     * @Description 逻辑删除数据
     * @Date 17:25 2018/8/15 0015
     * @Param [domain]
     **/
    @Override
    public int deleteLogic(@PathVariable("id") String id) {
        return mapper.deleteLogic(new BaseDomain(id));
    }

    /**
     * @return int
     * @Author Stishein
     * @Description 批量插入数据
     * @Date 17:32 2018/8/15 0015
     * @Param [list]
     **/
    @Override
    public int insertBatch(@RequestBody List<T> domains) {
        Date now = new Date();
        domains.forEach((domain) -> domain.setCreateDate(now));
        return mapper.insertBatch(domains);
    }

    /**
     * @return int
     * @Author Stishein
     * @Description 批量更新数据
     * @Date 17:33 2018/8/15 0015
     * @Param [domains]
     **/
    @Override
    public int updateBatch(@RequestBody List<T> domains) {
        Date now = new Date();
        domains.forEach((domain) -> domain.setModifyDate(now));
        return mapper.updateBatch(domains);
    }

    /**
     * @return int
     * @Author Stishein
     * @Description 批量逻辑删除数据，返回数据列表
     * @Date 17:42 2018/8/15 0015
     * @Param [domains]
     **/
    @Override
    public int deleteBatch(@RequestBody List<T> domains) {
        return mapper.deleteBatch(domains);
    }

    /**
     * @return int
     * @Author Stishein
     * @Description 批量逻辑删除数据，返回数据列表
     * @Date 17:42 2018/8/15 0015
     * @Param [domains]
     **/
    @Override
    public int deleteLogicBatch(@RequestBody List<T> domains) {
        return mapper.deleteLogicBatch(domains);
    }
}
