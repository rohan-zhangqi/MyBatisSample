package tk.mybatis.simple.mapper;

import org.apache.ibatis.annotations.Param;
import tk.mybatis.simple.model.SysRole;
import tk.mybatis.simple.model.SysUser;

import java.util.List;

/**
 * @Auther: Qi.Zhang4
 * @Date: 2019/5/23 08:43
 * @Description:
 */
public interface UserMapper {
    /**
     * 通过id查询用户
     * @param id
     * @return
     */
    SysUser selectById(Long id);

    /**
     * 查询全部
     * @return
     */
    List<SysUser> selectAll();

    /**
     * 根据用户id获取角色信息
     * @param userId
     * @return
     */
    List<SysRole> selectRolesByUserId(Long userId);

    /**
     * 新增用户
     * @param sysUser
     * @return
     */
    int insert(SysUser sysUser);

    /**
     * 新增用户-使用useGeneratedKeys方式
     * @param sysUser
     * @return
     */
    int insert2(SysUser sysUser);

    /**
     * 新增用户-使用selectKey方式
     * @param sysUser
     * @return
     */
    int insert3(SysUser sysUser);

    /**
     * 根据主键更新
     * @param sysUser
     * @return
     */
    int updateById(SysUser sysUser);

    /**
     * 通过主键删除
     * @param id
     * @return
     */
    int deleteById(Long id);

    /**
     * 通过主键删除
     * @param sysUser
     * @return
     */
    int deleteById(SysUser sysUser);

    /**
     * 根据用户id和角色的enabled状态获取用户的角色
     * @param userId
     * @param enabled
     * @return
     */
    List<SysRole> selectRolesByUserIdAndRoleEnabled(Long userId, Integer enabled);

    /**
     * 根据用户id和角色的enabled状态获取用户的角色
     * @param user
     * @param role
     * @return
     */
    List<SysRole> selectRolesByUserAndRole(@Param("user") SysUser user, @Param("role") SysRole role);

    /**
     * 根据动态条件查询用户信息
     * @param user
     * @return
     */
    List<SysUser> selectByUser(SysUser user);

    /**
     * 根据主键更新
     *
     * @param sysUser
     * @return
     */
    int updateByIdSelective(SysUser sysUser);
}
