package tk.mybatis.simple.mapper;

/**
 * @Auther: Qi.Zhang4
 * @Date: 2019/5/22 08:28
 * @Description:
 */

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import tk.mybatis.simple.model.Country;

import java.util.List;

public class CountryMapperTest extends BaseMapperTest {

    @Test
    public void testSelectAll() {
        SqlSession sqlSession = getSqlSession();
        try {
            List<Country> countryList = sqlSession.selectList("tk.mybatis.simple.mapper.CountryMapper.selectAll");
            printCountryList(countryList);
        } finally {
            //不要忘记关闭 sqlSession
            sqlSession.close();
        }
    }

    private void printCountryList(List<Country> countryList) {
        for (Country country : countryList) {
            System.out.printf("%-4d%4s%4s\n", country.getId(), country.getCountryname(), country.getCountrycode());
        }
    }
}
