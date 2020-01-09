package edu.graduation.b2cshoppingmall.service;

import edu.graduation.b2cshoppingmall.car.bean.OrderCar;

import java.util.List;

/**
 * 购物车的接口
 */
public interface OrderCarService {

    /**
     * 查询购物车信息 分页展示
     * @param pageNumber 当前页数
     * @param pageSize 每页记录数
     * @return List<OrderCar>
     */
    List<OrderCar> queryOrderCar(Integer pageNumber,Integer pageSize);

    /**
     * 添加一条购物车信息
     * @param orderCar
     * @return boolean
     */
    boolean addOrderCar(OrderCar orderCar);

    /**
     * 根据ID删除一条购物车信息
     * @param id
     * @return boolean
     */
    boolean delOrderCar(Integer id);

    /**
     * 修改原有的购物车信息
     * @param orderCar
     * @return boolean
     */
    boolean updateOrderCar(OrderCar orderCar);
}
