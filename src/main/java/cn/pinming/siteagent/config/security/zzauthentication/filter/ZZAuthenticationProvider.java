package cn.pinming.siteagent.config.security.zzauthentication.filter;

import cn.pinming.siteagent.config.security.zzauthentication.ZZRpcAuthentica;
import cn.pinming.siteagent.config.security.zzauthentication.ZZUserDetailService;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.InternalAuthenticationServiceException;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Component;

/**
 * @Auther: 36560
 * @Date: 2020/2/22 :11:05
 * @Description:
 */
@Component
public class ZZAuthenticationProvider implements AuthenticationProvider {

    private UserDetailsService userDetailsService = new ZZUserDetailService();

    private ZZRpcAuthentica zzRpcAuthentica = new ZZRpcAuthentica();

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        ZZAuthenticationToken ZZToken = (ZZAuthenticationToken) authentication;
        boolean userOk = zzRpcAuthentica.isUserOk(authentication);
        if (!userOk){
            throw new InternalAuthenticationServiceException("用户名或密码存在错误");
        }
        UserDetails userDetails = userDetailsService.loadUserByUsername((String) ZZToken.getPrincipal());
        if (userDetails == null){
            throw new InternalAuthenticationServiceException("无法获取用户信息");
        }
        ZZAuthenticationToken zzAuthenticationToken = new ZZAuthenticationToken(ZZToken.getPrincipal(),ZZToken.getCredentials(),null);
        zzAuthenticationToken.setDetails(authentication.getDetails());
        return zzAuthenticationToken;
    }

    @Override
    public boolean supports(Class<?> authentication) {
        return ZZAuthenticationToken.class.isAssignableFrom(authentication);
    }
}
