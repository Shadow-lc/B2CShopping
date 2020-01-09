package edu.graduation.b2cshoppingmall.service;

import edu.graduation.b2cshoppingmall.goods.bean.Goods;

import java.util.List;

/**
 * 商品接口
 */
public interface GoodsService {

    /**
     * 根据条件查询所有商品信息  分页展示
     * @param goodsName
     * @param pageNumber
     * @param pageSize
     * @return
     */
    List<Goods> queryAll(String goodsName,Integer pageNumber,Integer pageSize);

    /**
     * 添加一条商品信息
     * @param goods
     * @return boolean
     */
    boolean addGoods(Goods goods);

    /**
     * 上下级的操作
     * @param id 商品id
     * @param isPutAway 商品上下架的状态 0上架  1下架
     * @return boolean
     */
    boolean StandUpAndDown(Integer id,String isPutAway);
}
