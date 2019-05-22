package tk.mybatis.simple.model;

import lombok.Data;

/**
 * @Auther: Qi.Zhang4
 * @Date: 2019/5/22 08:21
 * @Description:
 */
@Data
public class Country {
    private Long id;
    private String countryname;
    private String countrycode;
}
