package edu.graduation.b2cshoppingmall.address.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 收货地址
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Address {

    /**
     * 收货地址id
     */
    private int id;

    /**
     * 会员ID
     */
    private int memberId;

    /**
     * 收货人姓名
     */
    private String name;

    /**
     * 省编号
     */
    private String provinceId;

    /**
     * 市编号
     */
    private String cityId;

    /**
     * 区编号
     */
    private String areaId;

    /**
     * 详细地址
     */
    private String address;

    /**
     * 手机号
     */
    private String phoneNum;

    /**
     * 是否默认地址
     */
    private String idDefault;

    /**
     * 是否删除
     */
    private String isDelete;

}
