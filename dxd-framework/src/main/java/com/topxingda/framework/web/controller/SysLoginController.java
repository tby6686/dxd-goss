package com.topxingda.framework.web.controller;

import com.topxingda.common.constant.Constants;
import com.topxingda.common.core.domain.AjaxResult;
import com.topxingda.framework.web.domain.LoginBody;
import com.topxingda.framework.web.service.SysLoginService;
import javax.annotation.Resource;
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

    @Resource
    private SysLoginService sysLoginService;

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
        String token = sysLoginService
            .login(loginBody.getUsername(), loginBody.getPassword(), loginBody.getCode(),
                loginBody.getUuid());
        ajax.put(Constants.TOKEN, token);
        return ajax;
    }

}
