package edu.graduation.b2cshoppingmall.order;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 订单清单
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderDetail {

    /**
     * 订单清单id
     */
    private int id;

    /**
     * 订单号
     */
    private String orderNo;

    /**
     * 商品编号
     */
    private int goodsId;

    /**
     * 商品名称
     */
    private String goodsName;

    /**
     * 价格
     */
    private double price;

    /**
     * 折扣
     */
    private double discount;

    /**
     * 折扣价
     */
    private double discountPrice;

    /**
     * 数量
     */
    private int num;

    /**
     * 总价
     */
    private double allPrice;
}
