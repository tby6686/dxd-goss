package com.topxingda.system.domain;

import com.topxingda.common.core.domain.BaseEntity;
import java.util.Date;
import lombok.Data;

/**
 * @author tby
 * @description "gsm_config"."sys_operate_log"
 * @date 2022-07-18 17:15
 */
@Data
public class SysOperateLogVo extends BaseEntity {
    private Long id;

    /**
     * 操作员ID
     */
    private Long user_id;

    /**
     * 操作员姓名
     */
    private String user_name;

    /**
     * 操作时间
     */
    private Date operate_time;

    /**
     * 操作模块
     */
    private String module;

    /**
     * 功能
     */
    private String function;

    /**
     * 操作类型
     */
    private Integer type;

    /**
     *操作描述
     */
    private String description;

    /**
     * 操作结果
     */
    private Integer result;

    /**
     *失败原因
     */
    private String reason;

    /**
     *详细信息
     */
    private String detail;

}
