package edu.graduation.b2cshoppingmall.goods.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 商品评论
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class GoodsReview {

    /**
     * 商品评论id
     */
    private int id;

    /**
     * 商品编号
     */
    private int goodsId;

    /**
     * 会员编号
     */
    private int memberId;

    /**
     * 会员名
     */
    private String memberName;

    /**
     * 发表时间
     */
    private String publishDate;

    /**
     * 评论内容
     */
    private String review;

    /**
     * 分数
     */
    private double score;

    /**
     * 是否删除
     */
    private String isDelete;

}
