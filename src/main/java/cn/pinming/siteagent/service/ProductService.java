package cn.pinming.siteagent.service;

import cn.pinming.siteagent.model.Product;
import cn.pinming.siteagent.vo.ProductVo;

/**
 * @Auther: 36560
 * @Date: 2020/2/23 :13:46
 * @Description:
 */
public interface ProductService {

    /**
     * 获取代理商所有授权的产品
     * @return
     */
    ProductVo getAllProducts(Integer agentId);

    /**
     * 获取所有的产品
     * @return
     */
    Product getAllProducts();

}
