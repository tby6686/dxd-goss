package com.topxingda.system.domain;

import com.topxingda.common.core.domain.BaseEntity;
import lombok.Data;

/**
 * @author tby
 * @description "gsm_config"."sys_resource"
 * @date 2022-07-18 17:08
 */
@Data
public class SysResourceVo extends BaseEntity {

    private Long id;

    /**
     * 资源名
     */
    private String name;

    /**
     * 资源路径
     */
    private String url;

    /**
     * 父级资源的主键，顶级资源为parent_id为0
     */
    private Long parent_id;

    /**
     * 资源类型，（1、模块，2、菜单，3、链接，4、操作按钮）
     */
    private Integer type;

    /**
     * 资源样式
     */
    private String clazz;

    /**
     * 显示排序，
     */
    private Integer show_index;

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

    /**
     * 1通信,2信号,3联合
     */
    private Integer major_type;

}
