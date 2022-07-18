package com.topxingda.system.domain;

import com.topxingda.common.core.domain.BaseEntity;
import lombok.Data;

/**
 * @author tby
 * @description "gsm_config"."sys_user"
 * @date 2022-07-18 16:59
 */
@Data
public class SysUserVo extends BaseEntity {

    private Long id;
    /**用户名**/
    private String name;
    /**登录名**/
    private String login_id;
    /**密码**/
    private String pwd;
    /**手机号码**/
    private String mobile_phone;
    /**电话号码**/
    private String office_phone;
    /**住址**/
    private String address;
    /**逻辑删除（0、已删除，1、未删除）**/
    private Integer is_del;
    /**修改记录的用户编号**/
    private Long edit_user_id;
    /**修改记录的时间**/
    private Long edit_time;
    /**用户所在的部门id**/
    private Long org_id;
}
