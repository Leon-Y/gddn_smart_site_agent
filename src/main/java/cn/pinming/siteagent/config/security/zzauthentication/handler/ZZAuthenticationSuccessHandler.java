package cn.pinming.siteagent.config.security.zzauthentication.handler;

import cn.pinming.siteagent.common.response.SuccessResponse;
import cn.pinming.siteagent.config.security.properties.SmartSiteProperties;
import cn.pinming.siteagent.enums.LoginType;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationSuccessHandler;
import org.springframework.security.web.savedrequest.HttpSessionRequestCache;
import org.springframework.security.web.savedrequest.RequestCache;
import org.springframework.security.web.savedrequest.SavedRequest;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Auther: 36560
 * @Date: 2020/2/13 :13:42
 * @Description: 桩桩登录成功的处理器
 */
@Component
public class ZZAuthenticationSuccessHandler extends SimpleUrlAuthenticationSuccessHandler {

    private ObjectMapper objectMapper = new ObjectMapper();

    @Override
    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws IOException, ServletException {
            response.getWriter().write(objectMapper.writeValueAsString(new SuccessResponse<>("success")));
            response.setContentType("application/json;charset=UTF-8");
    }
}
