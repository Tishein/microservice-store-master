package com.tishein.tstore.common.base.manager;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.tishein.tstore.common.base.domain.BaseDomain;
import com.tishein.tstore.common.base.mapper.BaseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Date;
import java.util.List;

/**
 * @ClassName BaseManager
 * @Description 基础管理层
 * @Author Administrator
 * @Date 2018/8/20 0020 15:15
 */
public class BaseManager<T extends BaseDomain, ID> {

    @Autowired
    protected BaseMapper<T> mapper;

    /**
     * @return java.util.List<com.tishein.tstore.domain.BaseDomain>
     * @Author
     * @Description Stishein
     * @Date 17:45 2018/8/15 0015
     * @Param [domain]
     **/
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
    public PageInfo<T> list(T domain, Integer pageNum, Integer pageSize) {
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
    public T get(ID id) {
        return mapper.get(new BaseDomain(id));
    }

    /**
     * @return int
     * @Author Stishein
     * @Description 插入数据
     * @Date 17:12 2018/8/15 0015
     * @Param [domain]
     **/
    public int insert(T domain) {
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
    public int update(T domain) {
        domain.setModifyDate(new Date());
        return mapper.update(domain);
    }

    /**
     * @return int
     * @Author Stishein
     * @Description 逻辑删除数据
     * @Date 17:25 2018/8/15 0015
     * @Param [domain]
     *
     * @param id*/
    public int delete(ID id) {
        return mapper.delete(new BaseDomain(id));
    }

    /**
     * @return int
     * @Author Stishein
     * @Description 逻辑删除数据
     * @Date 17:25 2018/8/15 0015
     * @Param [domain]
     **/
    public int deleteLogic(ID id) {
        return mapper.deleteLogic(new BaseDomain<>(id));
    }

    /**
     * @return int
     * @Author Stishein
     * @Description 批量插入数据
     * @Date 17:32 2018/8/15 0015
     * @Param [list]
     **/
    public int insertBatch(List<T> domains) {
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
    public int deleteBatch(List<T> domains) {
        return mapper.deleteBatch(domains);
    }

    /**
     * @return int
     * @Author Stishein
     * @Description 批量逻辑删除数据，返回数据列表
     * @Date 17:42 2018/8/15 0015
     * @Param [domains]
     **/
    public int deleteLogicBatch(List<T> domains) {
        return mapper.deleteLogicBatch(domains);
    }
}
