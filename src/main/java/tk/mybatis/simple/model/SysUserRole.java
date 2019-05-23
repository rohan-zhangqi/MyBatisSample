package tk.mybatis.simple.model;

import lombok.Data;

/**
 * @Auther: Qi.Zhang4
 * @Date: 2019/5/23 08:05
 * @Description:
 */
@Data
public class SysUserRole {
    /**
     * 用户ID
     */
    private Long userId;

    /**
     * 角色ID
     */
    private Long roleId;
}
