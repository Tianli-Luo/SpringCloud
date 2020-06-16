package com.ltl.springcloud.dao;

import com.ltl.springcloud.domain.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author Tianly
 * @auther zzyy
 * @create 2020-02-26 15:17
 */

@Mapper
public interface OrderDao {


    /**
     * 新建订单
     * @param order
     */
    void create(Order order);

    /**
     * 修改订单状态，从零改为1
     * @param userId
     * @param status
     */
    void update(@Param("userId") Long userId,@Param("status") Integer status);
}
