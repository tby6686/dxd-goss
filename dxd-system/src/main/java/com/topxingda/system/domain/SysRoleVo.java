package com.topxingda.system.domain;

import com.topxingda.common.core.domain.BaseEntity;
import lombok.Data;

/**
 * @author tby
 * @description  "gsm_config"."sys_role"
 * @date 2022-07-18 17:05
 */
@Data
public class SysRoleVo extends BaseEntity {

    private Long id;

    /**
     * 角色名
     */
    private String name;

    /**
     * 角色描述
     */
    private String description;

    /**
     * 逻辑删除（0、已删除，1、未删除）
     */
    private Integer is_del;

    /**
     * 修改记录的用户主键
     */
    private Long edit_user_id;

    /**
     * 修改记录的时间
     */
    private Long edit_time;

}
