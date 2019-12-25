package edu.graduation.b2cshoppingmall.goods.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 商品类别
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class GoodsType {

    /**
     * 商品类别ID
     */
    private int id;

    /**
     * 类别编号
     */
    private int typeId;

    /**
     * 类别名
     */
    private String typeName;

    /**
     * 规格编号
     */
    private String standardId;

    /**
     * 父类别编号
     */
    private int parentId;

    /**
     * 是否删除
     */
    private String isDelete;
}
