package tk.mybatis.simple.model;

import lombok.Data;

import java.util.Date;

/**
 * @Auther: Qi.Zhang4
 * @Date: 2019/5/23 08:09
 * @Description:
 */
@Data
public class SysRole {

    /**
     * 角色ID
     */
    private Long id;

    /**
     * 角色名
     */
    private String roleName;

    /**
     * 有效标志
     */
    private Integer enabled;

    /**
     * 创建人
     */
    private Long createBy;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 用户信息
     */
    private SysUser user;

}
