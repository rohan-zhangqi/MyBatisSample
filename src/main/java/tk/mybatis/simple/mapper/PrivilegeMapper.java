package tk.mybatis.simple.mapper;

import org.apache.ibatis.annotations.SelectProvider;
import tk.mybatis.simple.model.SysPrivilege;
import tk.mybatis.simple.provider.PrivilegeProvider;

/**
 * @Auther: Qi.Zhang4
 * @Date: 2019/5/23 08:43
 * @Description:
 */
public interface PrivilegeMapper {

    /**
     * type：一个包含method属性指定方法的类，这个类必须有空的构造方法，这个方法的值就是要执行的SQL语句
     * method：指定的方法的返回值必须是String类型
     * @param id
     * @return
     */
    @SelectProvider(type = PrivilegeProvider.class, method = "selectById")
    SysPrivilege selectById(Long id);
}
