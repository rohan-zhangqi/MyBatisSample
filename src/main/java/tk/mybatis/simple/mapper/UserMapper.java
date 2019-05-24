package tk.mybatis.simple.mapper;

import tk.mybatis.simple.model.SysUser;

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
}
