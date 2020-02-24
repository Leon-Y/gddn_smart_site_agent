package cn.pinming.siteagent.config.security.zzauthentication.filter;

import cn.pinming.siteagent.config.security.zzauthentication.handler.ZZAuthenticationFailureHandler;
import cn.pinming.siteagent.config.security.zzauthentication.handler.ZZAuthenticationSuccessHandler;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.SecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.DefaultSecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @Auther: 36560
 * @Date: 2020/2/23 :10:42
 * @Description:
 */
@Component
public class ZZAuthenticationConfig extends SecurityConfigurerAdapter<DefaultSecurityFilterChain, HttpSecurity> {

    @Resource
    private ZZAuthenticationSuccessHandler zzAuthenticationSuccessHandler;

    @Resource
    private ZZAuthenticationFailureHandler zzAuthenticationFailureHandler;

    @Override
    public void configure(HttpSecurity http) throws Exception {
        /**
         * 设置桩桩的过滤器内容
         */
        ZZUserNamePasswordAuthenticationFilter zzFilter = new ZZUserNamePasswordAuthenticationFilter();
        zzFilter.setAuthenticationManager(http.getSharedObject(AuthenticationManager.class));
        zzFilter.setAuthenticationSuccessHandler(zzAuthenticationSuccessHandler);
        zzFilter.setAuthenticationFailureHandler(zzAuthenticationFailureHandler);
        ZZAuthenticationProvider zzAuthenticationProvider = new ZZAuthenticationProvider();
        http.authenticationProvider(zzAuthenticationProvider).addFilterAfter(zzFilter,UsernamePasswordAuthenticationFilter.class);

    }
}
