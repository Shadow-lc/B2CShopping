package edu.graduation.b2cshoppingmall.car;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 购物车
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderCar {

    /**
     * 购物车id
     */
    private int id;

    /**
     * 会员编号
     */
    private int memberId;

    /**
     * 商品编号
     */
    private int goodsId;

    /**
     * 数量
     */
    private int num;

    /**
     * 加入时间
     */
    private String addDate;
}
