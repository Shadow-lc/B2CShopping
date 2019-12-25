package edu.graduation.b2cshoppingmall.car;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 收藏夹
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Collect {

    /**
     * 收藏夹ID
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
     * 收藏时间
     */
    private String collectionDate;
}
