package tk.mybatis.simple.model;

import lombok.Data;

/**
 * @Auther: Qi.Zhang4
 * @Date: 2019/5/23 08:09
 * @Description:
 */
@Data
public class SysPrivilege {

    /**
     * 权限ID
     */
    private Long id;

    /**
     * 权限名称
     */
    private String privilegeName;

    /**
     * 权限URL
     */
    private String privilegeUrl;
}
