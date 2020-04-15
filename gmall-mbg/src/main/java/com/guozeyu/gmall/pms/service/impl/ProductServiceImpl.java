package com.guozeyu.gmall.pms.service.impl;

import com.guozeyu.gmall.pms.entity.Product;
import com.guozeyu.gmall.pms.mapper.ProductMapper;
import com.guozeyu.gmall.pms.service.ProductService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 商品信息 服务实现类
 * </p>
 *
 * @author Lfy
 * @since 2020-04-15
 */
@Service
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product> implements ProductService {

}
