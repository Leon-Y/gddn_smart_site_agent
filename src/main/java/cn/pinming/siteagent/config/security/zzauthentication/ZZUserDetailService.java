package cn.pinming.siteagent.config.security.zzauthentication;

import cn.pinming.siteagent.model.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

/**
 * @Auther: 36560
 * @Date: 2020/2/22 :11:07
 * @Description:
 */
@Component("ZZUserDetailService")
public class ZZUserDetailService implements UserDetailsService {

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        User user = new User();
        user.setUserName("user");
        user.setPassword("123456");
        ZZUser zzUser = new ZZUser();
        zzUser.setUser(user);
        return zzUser;
    }
}
