package com.guozeyu.gmall.oms.service.impl;

import com.guozeyu.gmall.oms.entity.OrderItem;
import com.guozeyu.gmall.oms.mapper.OrderItemMapper;
import com.guozeyu.gmall.oms.service.OrderItemService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 订单中所包含的商品 服务实现类
 * </p>
 *
 * @author Lfy
 * @since 2020-04-15
 */
@Service
public class OrderItemServiceImpl extends ServiceImpl<OrderItemMapper, OrderItem> implements OrderItemService {

}
