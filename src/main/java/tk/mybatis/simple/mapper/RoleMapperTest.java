package tk.mybatis.simple.mapper;

import org.apache.ibatis.session.SqlSession;
import org.junit.Assert;
import org.junit.Test;
import tk.mybatis.simple.model.SysRole;

import java.util.List;

/**
 * @Auther: Qi.Zhang4
 * @Date: 2019/7/2 08:36
 * @Description:
 */
public class RoleMapperTest extends BaseMapperTest {

    @Test
    public void testSelectById(){
        // 获取SqlSession
        SqlSession sqlSession = getSqlSession();
        try{
            // 获取RoleMapper接口
            RoleMapper roleMapper = sqlSession.getMapper(RoleMapper.class);
            //调用selectById方法，查询id = 1的角色
            SysRole role = roleMapper.selectById(1L);
            //role不为空
            Assert.assertNotNull(role);
            //roleName = 管理员
            Assert.assertEquals("管理员", role.getRoleName());
        } finally {
            //不要忘记关闭sqlSession
            sqlSession.close();
        }
    }

    @Test
    public void testSelectById2(){
        // 获取SqlSession
        SqlSession sqlSession = getSqlSession();
        try{
            // 获取RoleMapper接口
            RoleMapper roleMapper = sqlSession.getMapper(RoleMapper.class);
            //调用selectById2方法，查询id = 1的角色
            SysRole role = roleMapper.selectById2(1L);
            //role不为空
            Assert.assertNotNull(role);
            //roleName = 管理员
            Assert.assertEquals("管理员", role.getRoleName());
        } finally {
            //不要忘记关闭sqlSession
            sqlSession.close();
        }
    }

    @Test
    public void testSelectAll(){
        // 获取SqlSession
        SqlSession sqlSession = getSqlSession();
        try{
            // 获取RoleMapper接口
            RoleMapper roleMapper = sqlSession.getMapper(RoleMapper.class);
            //调用selectAll方法查询所有角色
            List<SysRole> roleList = roleMapper.selectAll();
            //结果不为空
            Assert.assertNotNull(roleList);
            //角色数量大于0个
            Assert.assertTrue(roleList.size() > 0);
            //验证下划线字段是否映射成功
            Assert.assertNotNull(roleList.get(0).getRoleName());
        } finally {
            //不要忘记关闭sqlSession
            sqlSession.close();
        }
    }
}
