package edu.graduation.b2cshoppingmall.member.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
/**
 * 会员表
 */
public class member {

    /**
     * 会员id
     */
    private int id;

    /**
     * 用户名
     */
    private String username;


    /**
     * 密码
     */
    private String password;

    /**
     * 年龄
     */
    private int age;

    /**
     * 生日
     */
    private String birthday;

    /**
     * 手机号
     */
    private String phone;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 会员积分
     */
    private int memberCredit;

    /**
     * 会员等级编号
     */
    private int memberLayerId;

    /**
     * 是否删除
     */
    private String isDelete;
}
