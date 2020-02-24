package cn.pinming.siteagent.service.impl;

import cn.pinming.siteagent.mapper.ProductMapper;
import cn.pinming.siteagent.model.Product;
import cn.pinming.siteagent.service.ProductService;
import cn.pinming.siteagent.vo.ProductVo;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Auther: 36560
 * @Date: 2020/2/23 :13:50
 * @Description:
 */
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductMapper productMapper;

    @Override
    public ProductVo getAllProducts(Integer agentId) {

        return null;
    }

    @Override
    public Product getAllProducts() {
        return null;
    }
}
