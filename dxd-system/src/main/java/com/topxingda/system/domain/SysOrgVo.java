package com.topxingda.system.domain;

import com.topxingda.common.core.domain.BaseEntity;
import lombok.Data;

/**
 * @author tby
 * @description "gsm_config"."sys_org"
 * @date 2022-07-18 17:12
 */
@Data
public class SysOrgVo extends BaseEntity {

    private Long id;

    /**
     * 机构名称
     */
    private String name;

    /**
     * 机构描述
     */
    private String description;

    /**
     * 上级部门ID
     */
    private Long parent_id;

    /**
     * 修改记录的用户主键
     */
    private Long edit_user_id;

    /**
     * 修改记录的时间
     */
    private Long edit_time;

    /**
     * 级别
     */
    private Integer level;

}
