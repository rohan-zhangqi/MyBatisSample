package tk.mybatis.simple.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import tk.mybatis.simple.model.SysRole;

import java.util.List;

/**
 * @Auther: Qi.Zhang4
 * @Date: 2019/5/23 08:43
 * @Description:
 */
public interface RoleMapper {

    /**
     * 3.1.2 使用resultMap方式
     * @return
     */
    @Results(id = "roleResultMap", value={
        @Result(property = "id", column = "id", id = true),
        @Result(property = "roleName", column = "role_name"),
        @Result(property = "enabled", column = "enabled"),
        @Result(property = "createBy", column = "create_by"),
        @Result(property = "createTime", column = "create_time")
    })

    /**
     * 3.1 @Select注解：以下两种方式都可以
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

    /**
     * 3.1.2 使用resultMap方式
     * @return
     */
    @ResultMap("roleResultMap")
    @Select("select * from sys_role")
    List<SysRole> selectAll();

    /**
     * 3.2.1 不需要返回主键
     * @param sysRole
     * @return
     */
    @Insert({"insert into sys_role(id, role_name, enabled, create_by, create_time)",
        "values(#{id}, #{roleName}, #{enabled}, #{createBy}, #{createTime, jdbcType=TIMESTAMP})"})
    int insert(SysRole sysRole);

    /**
     * 3.2.2 返回自增主键
     * @param sysRole
     * @return
     */
    @Insert({"insert into sys_role(role_name, enabled, create_by, create_time)",
        "values(#{roleName}, #{enabled}, #{createBy}, #{createTime, jdbcType=TIMESTAMP})"})
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insert2(SysRole sysRole);

    /**
     * 3.2.3 返回非自增主键
     * @param sysRole
     * @return
     */
    @Insert({"insert into sys_role(role_name, enabled, create_by, create_time)",
        "values(#{roleName}, #{enabled}, #{createBy}, #{createTime, jdbcType=TIMESTAMP})"})
    @SelectKey(statement = "SELECT LAST_INSERT_ID()",
                keyProperty = "id",
                resultType = Long.class,
                before = false)
    int insert3(SysRole sysRole);


}
