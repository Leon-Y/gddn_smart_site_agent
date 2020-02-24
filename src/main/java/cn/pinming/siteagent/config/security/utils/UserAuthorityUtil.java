package cn.pinming.siteagent.config.security.utils;

import cn.pinming.siteagent.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;

/**
 * @Auther: 36560
 * @Date: 2020/2/22 :19:56
 * @Description:
 */
public class UserAuthorityUtil {

    private static UserService userService;

    @Autowired
    public static void setUserService(UserService userService) {
        UserAuthorityUtil.userService = userService;
    }

    public static UserDetails getCurrentUser(){
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        UserDetails userDetails = userService.getUserDetailsByUserTelNumberOrName((String) authentication.getPrincipal());
        return userDetails;
    }
}
