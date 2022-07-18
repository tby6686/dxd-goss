package com.topxingda.framework.web.service;

import javax.annotation.Resource;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;
import sun.misc.MessageUtils;

/**
 * @author tby
 * @description
 * @date 2022-07-18 16:32
 */
@Component
public class SysLoginService {

    @Resource
    private AuthenticationManager authenticationManager;

    @Override
    public String login(String username, String password, String code, String uuid) {
        // 用户验证
        Authentication authentication = null;
        try {
            // 该方法会去调用UserDetaiUserDetailsServiceImpllsServiceImpl.loadUserByUsername
            authentication = authenticationManager
                .authenticate(new UsernamePasswordAuthenticationToken(username, password));
        } catch (Exception e) {
            if (e instanceof BadCredentialsException) {
                AsyncManager.me().execute(
                    AsyncFactory.recordLogininfor(username, Constants.LOGIN_FAIL, MessageUtils
                        .message("user.password.not.match")));
                throw new UserPasswordNotMatchException();
            } else {
                AsyncManager.me().execute(
                    AsyncFactory.recordLogininfor(username, Constants.LOGIN_FAIL, e.getMessage()));
                throw new ServiceException(e.getMessage());
            }
        }
        AsyncManager.me().execute(AsyncFactory.recordLogininfor(username, Constants.LOGIN_SUCCESS,
            MessageUtils.message("user.login.success")));
        LoginUser loginUser = (LoginUser) authentication.getPrincipal();
        recordLoginInfo(loginUser.getUserId());
        // 生成token
        return tokenService.createToken(loginUser);
    }
}
