package edu.graduation.b2cshoppingmall.goods.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 商品库存
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class GoodsStock {

    /**
     * 商品库存id
     */
    private int id;

    /**
     * 商品id
     */
    private int goodsId;

    /**
     * 规格详情
     */
    private String standardInfo;

    /**
     * 库存量
     */
    private int stockNum;

    /**
     * 价格
     */
    private double price;
}
