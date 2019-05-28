package tk.mybatis.simple.mapper;

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
}
