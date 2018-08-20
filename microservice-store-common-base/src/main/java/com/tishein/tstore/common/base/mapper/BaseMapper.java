package com.tishein.tstore.common.base.mapper;

import com.tishein.tstore.common.base.domain.BaseDomain;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author Stishein
 * @Description 基础数据访问层
 * @Date 17:17 2018/8/15 0015
 **/
public interface BaseMapper<T extends BaseDomain> {

    /**
     * @Author
     * @Description Stishein
     * @Date 17:45 2018/8/15 0015
     * @Param [domain]
     * @return java.util.List<com.tishein.tstore.domain.BaseDomain>
     **/
    List<T> list(@Param("d") T domain);

    /**
     * @Author Stishein
     * @Description 根据参数条件查询数据，返回一个结果
     * @Date 17:26 2018/8/15 0015
     * @Param [domain]
     * @return com.tishein.tstore.domain.BaseDomain
     **/
    T get(@Param("d") BaseDomain domain);

    /**
     * @Author Stishein
     * @Description 插入数据
     * @Date 17:12 2018/8/15 0015
     * @Param [domain]
     * @return int
     **/
    int insert(@Param("d") T domain);

    /**
     * @Author Stishein
     * @Description 更新数据
     * @Date 17:15 2018/8/15 0015
     * @Param [domain]
     * @return int
     **/
    int update(@Param("d") T domain);

    /**
     * @Author Stishein
     * @Description 删除数据
     * @Date 17:19 2018/8/15 0015
     * @Param [domain]
     * @return int
     **/
    int delete(@Param("d") BaseDomain domain);

    /**
     * @Author Stishein
     * @Description 逻辑删除数据
     * @Date 17:25 2018/8/15 0015
     * @Param [domain]
     * @return int
     **/
    int deleteLogic(@Param("d") BaseDomain domain);

    /**
     * @return int
     * @Author Stishein
     * @Description 批量插入数据
     * @Date 17:32 2018/8/15 0015
     * @Param [list]
     **/
    int insertBatch(@Param("ds") List<T> domains);

    /**
     * @Author Stishein
     * @Description 批量更新数据
     * @Date 17:33 2018/8/15 0015
     * @Param [domains]
     * @return int
     **/
    int updateBatch(@Param("ds") List<T> domains);

    /**
     * @return int
     * @Author Stishein
     * @Description 批量删除数据
     * @Date 17:40 2018/8/15 0015
     * @Param [domains]
     **/
    int deleteBatch(@Param("ds") List<T> domains);

    /**
     * @Author Stishein
     * @Description 批量逻辑删除数据，返回数据列表
     * @Date 17:42 2018/8/15 0015
     * @Param [list]
     * @return int
     **/
    int deleteLogicBatch(@Param("ds") List<T> list);
}
