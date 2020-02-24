package cn.pinming.siteagent.dubbo;

import api.agent.ProductService;
import cn.pinming.siteagent.model.Product;
import com.alibaba.dubbo.config.annotation.Service;
import dto.agent.AgentProductDto;
import dto.agent.PaginationDto;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @Auther: 36560
 * @Date: 2020/2/23 :14:53
 * @Description:
 */
@Service
public class ProductServiceImpl  implements ProductService {

    @Autowired
    private cn.pinming.siteagent.service.ProductService productService;

    @Override
    public AgentProductDto findOne(int id) {
        return null;
    }

    @Override
    public List<AgentProductDto> findAll() {
        Product allProducts = productService.getAllProducts();
        return null;
    }

    @Override
    public void create(AgentProductDto entity) {

    }

    @Override
    public void update(AgentProductDto entity) {

    }

    @Override
    public void delete(AgentProductDto entity) {

    }

    @Override
    public PaginationDto<AgentProductDto> paginationList(PaginationDto<AgentProductDto> paginationDto) {
        return null;
    }
}
