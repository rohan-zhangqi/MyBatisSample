package tk.mybatis.simple.model;

import lombok.Data;

import java.util.Date;

/**
 * @Auther: Qi.Zhang4
 * @Date: 2019/5/23 07:57
 * @Description:
 */
@Data
public class SysUser {
    /**
     * 用户ID
     */
    private Long id;

    /**
     * 用户名
     */
    private String userName;

    /**
     * 密码
     */
    private String userPassword;

    /**
     * 邮箱
     */
    private String userEmail;

    /**
     * 简介
     */
    private String userInfo;

    /**
     * 头像
     */
    private byte[] headImg;

    /**
     * 创建时间
     */
    private Date createTime;
}
