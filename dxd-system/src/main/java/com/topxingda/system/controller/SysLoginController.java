package com.topxingda.system.controller;

import com.topxingda.common.constant.Constants;
import com.topxingda.common.core.domain.AjaxResult;
import com.topxingda.system.domain.LoginBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author tby
 * @description
 * @date 2022-07-18 10:09
 */
@RestController
public class SysLoginController {

    /**
     * 登录方法
     *
     * @param loginBody 登录信息
     * @return 结果
     */
    @PostMapping("/login")
    public AjaxResult login(@RequestBody LoginBody loginBody) {
        AjaxResult ajax = AjaxResult.success();
        // 生成令牌
        String token = loginService
            .login(loginBody.getUsername(), loginBody.getPassword(), loginBody.getCode(),
                loginBody.getUuid());
        ajax.put(Constants.TOKEN, token);
        return ajax;
    }

}
