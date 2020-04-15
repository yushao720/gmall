package com.guozeyu.gmall.oms.service.impl;

import com.guozeyu.gmall.oms.entity.Order;
import com.guozeyu.gmall.oms.mapper.OrderMapper;
import com.guozeyu.gmall.oms.service.OrderService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 订单表 服务实现类
 * </p>
 *
 * @author Lfy
 * @since 2020-04-15
 */
@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order> implements OrderService {

}
