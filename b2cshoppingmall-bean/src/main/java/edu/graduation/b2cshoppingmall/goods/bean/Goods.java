package edu.graduation.b2cshoppingmall.goods.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 商品
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Goods {

    /**
     * 商品ID
     */
    private int id;

    /**
     * 商品编号
     */
    private int goodsId;

    /**
     * 商品类别编号
     */
    private int typeId;

    /**
     * 商品名称
     */
    private String goodsName;

    /**
     * 商品描述
     */
    private String goodsDesc;

    /**
     * 添加时间
     */
    private String addDate;

    /**
     * 是否上架
     */
    private String isPutaway;

    /**
     * 是否删除
     */
    private String isDelete;
}

