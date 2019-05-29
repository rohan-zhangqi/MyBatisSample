package tk.mybatis.simple.mapper;

import org.apache.ibatis.session.SqlSession;
import org.junit.Assert;
import org.junit.Test;
import tk.mybatis.simple.model.SysUser;

import java.util.List;

/**
 * @Auther: Qi.Zhang4
 * @Date: 2019/5/29 08:37
 * @Description:
 */
public class UserMapperTest extends BaseMapperTest {

    @Test
    public void testSelectById(){
        // 获取UserMapper接口
        SqlSession sqlSession = getSqlSession();
        try{
            //调用selectById方法，查询id = 1的用户
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            SysUser user = userMapper.selectById(1L);

            //user不为空
            Assert.assertNotNull(user);

            Assert.assertEquals("admin", user.getUserName());
        } finally {
            //不要忘记关闭sqlSession
            sqlSession.close();
        }
    }

    @Test
    public void testSelectAll(){
        SqlSession sqlSession = getSqlSession();
        try {
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

            //调用selectById方法查询所有用户
            List<SysUser> userList = userMapper.selectAll();

            //结果不为空
            Assert.assertNotNull(userList);

            Assert.assertTrue(userList.size() > 0);
        } finally {
            sqlSession.close();
        }
    }


}
