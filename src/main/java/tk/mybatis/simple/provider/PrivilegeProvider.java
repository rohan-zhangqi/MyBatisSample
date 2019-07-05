package tk.mybatis.simple.provider;

import org.apache.ibatis.jdbc.SQL;

/**
 * @Auther: Qi.Zhang4
 * @Date: 2019/7/5 12:35
 * @Description:
 */
public class PrivilegeProvider {

    public String selectById(final Long id){
        return new SQL(){
            {
                SELECT("id, privilege_name, privilege_url");
                FROM("sys_privilege");
                WHERE("id = #{id}");
            }
        }.toString();
    }
}
