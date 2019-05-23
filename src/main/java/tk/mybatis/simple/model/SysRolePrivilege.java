package tk.mybatis.simple.model;

import lombok.Data;

/**
 * @Auther: Qi.Zhang4
 * @Date: 2019/5/23 08:09
 * @Description:
 */
@Data
public class SysRolePrivilege {
    /**
     * 角色ID
     */
    private Long roleId;

    /**
     * 权限ID
     */
    private Long privilegeId;

}
