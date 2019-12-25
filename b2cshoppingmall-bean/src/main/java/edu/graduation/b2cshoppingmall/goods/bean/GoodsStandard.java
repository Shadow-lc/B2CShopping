package edu.graduation.b2cshoppingmall.goods.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 商品规格
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class GoodsStandard {

    /**
     * 商品规格id
     */
    private int id;

    /**
     * 规格名
     */
    private String standardName;

    /**
     * 规格值
     */
    private String standardValue;

}
