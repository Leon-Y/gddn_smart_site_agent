package cn.pinming.siteagent.dubbo;

import api.agent.AgentService;
import com.alibaba.dubbo.config.annotation.Service;
import dto.agent.AgentDto;
import dto.agent.PaginationDto;

import java.util.List;

/**
 * @Auther: 36560
 * @Date: 2020/2/24 :10:18
 * @Description: 代理商服务
 */
@Service
public class AgentServiceImpl implements AgentService {
    @Override
    public AgentDto findOne(int id) {
        return null;
    }

    @Override
    public List<AgentDto> findAll() {
        return null;
    }

    @Override
    public void create(AgentDto entity) {

    }

    @Override
    public void update(AgentDto entity) {

    }

    @Override
    public void delete(AgentDto entity) {

    }

    @Override
    public PaginationDto<AgentDto> paginationList(PaginationDto<AgentDto> paginationDto) {
        return null;
    }
}
