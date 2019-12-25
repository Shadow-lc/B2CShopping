package edu.graduation.b2cshoppingmall.member.bean;

import edu.graduation.b2cshoppingmall.order.Order;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 会员等级
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class memberLayer {

    /**
     * 会员等级编号
     */
    private int memberLayerId;

    /**
     * 会员积分下限
     */
    private int scoreFloor;

    /**
     * 会员等级
     */
    private String memberLayer;

    /**
     * 会员折扣
     */
    private String memberDiscount;
}
