package tk.mybatis.simple.mapper;

import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.simple.model.SysRole;

import java.util.List;

/**
 * @Auther: Qi.Zhang4
 * @Date: 2019/5/23 08:43
 * @Description:
 */
public interface RoleMapper {

    @Results(id = "roleResultMap", value={
        @Result(property = "id", column = "id", id = true),
        @Result(property = "roleName", column = "role_name"),
        @Result(property = "enabled", column = "enabled"),
        @Result(property = "createBy", column = "create_by"),
        @Result(property = "createTime", column = "create_time")
    })

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

    @Results({
        @Result(property = "id", column = "id", id = true),
        @Result(property = "roleName", column = "role_name"),
        @Result(property = "enabled", column = "enabled"),
        @Result(property = "createBy", column = "create_by"),
        @Result(property = "createTime", column = "create_time")
    })
    @Select({"select id, role_name, enabled, create_by, create_time from sys_role where id = #{id}"})
    SysRole selectById2(Long id);

    @ResultMap("roleResultMap")
    @Select("select * from sys_role")
    List<SysRole> selectAll();
}
