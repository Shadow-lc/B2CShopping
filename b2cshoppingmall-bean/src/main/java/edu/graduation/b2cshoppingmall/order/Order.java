package edu.graduation.b2cshoppingmall.order;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 订单
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Order {

    /**
     * 订单id
     */
    private int id;

    /**
     * 订单号
     */
    private String orderNo;

    /**
     * 会员编号
     */
    private int memberId;

    /**
     * 本次订单的的积分
     */
    private int credit;

    /**
     * 送货地址
     */
    private String address;

    /**
     * 支付方式
     */
    private String payType;

    /**
     * 下单时间
     */
    private String orderDate;

    /**
     * 订单金额
     */
    private double amount;

    /**
     * 使用积分
     */
    private int creditUsed;

    /**
     * 订单状态
     */
    private String status;

    /**
     * 处理情况
     */
    private String handle;

    /**
     * 是否删除
     */
    private String isDelete;
}
