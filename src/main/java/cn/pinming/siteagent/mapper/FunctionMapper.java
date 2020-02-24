package cn.pinming.siteagent.mapper;

import cn.pinming.siteagent.model.Function;
import cn.pinming.siteagent.model.FunctionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FunctionMapper {
    int countByExample(FunctionExample example);

    int deleteByExample(FunctionExample example);

    int insert(Function record);

    int insertSelective(Function record);

    List<Function> selectByExample(FunctionExample example);

    int updateByExampleSelective(@Param("record") Function record, @Param("example") FunctionExample example);

    int updateByExample(@Param("record") Function record, @Param("example") FunctionExample example);
}