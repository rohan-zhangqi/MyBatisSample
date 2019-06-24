package tk.mybatis.simple.mapper;

import org.apache.ibatis.annotations.Select;
import tk.mybatis.simple.model.SysRole;

/**
 * @Auther: Qi.Zhang4
 * @Date: 2019/5/23 08:43
 * @Description:
 */
public interface RoleMapper {

    /**
     * 以下两种方式都可以
     * @param id
     * @return
     */
    @Select({"select id, role_name roleName, enabled, create_by createBy, create_time createTime ",
            "from sys_role ",
            "where id = #{id}"})
//    @Select({"select id, role_name roleName, enabled, create_by createBy, create_time createTime from sys_role where id = #{id}"})
    SysRole selectById(Long id);
}
