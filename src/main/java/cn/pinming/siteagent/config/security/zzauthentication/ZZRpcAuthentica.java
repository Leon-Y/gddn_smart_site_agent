package cn.pinming.siteagent.config.security.zzauthentication;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;

/**
 * @Auther: 36560
 * @Date: 2020/2/22 :19:50
 * @Description:
 */
@Component
public class ZZRpcAuthentica {

    /**
     * 校验用户是否是存在，并且密码正确
     * @return
     */
    public boolean isUserOk(Authentication authentication){
        return true;
    };
}
