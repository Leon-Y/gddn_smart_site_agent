package cn.pinming.siteagent.mapper;

import cn.pinming.siteagent.model.Product;
import cn.pinming.siteagent.model.ProductExample;
import java.util.List;

import cn.pinming.siteagent.vo.ProductVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ProductMapper {
    int countByExample(ProductExample example);

    int deleteByExample(ProductExample example);

    int insert(Product record);

    int insertSelective(Product record);

    List<Product> selectByExample(ProductExample example);

    int updateByExampleSelective(@Param("record") Product record, @Param("example") ProductExample example);

    int updateByExample(@Param("record") Product record, @Param("example") ProductExample example);

    /**
     * 获取代理商下面的所有产品
     */
    ProductVo getAgentProducts(Integer agentId);
}