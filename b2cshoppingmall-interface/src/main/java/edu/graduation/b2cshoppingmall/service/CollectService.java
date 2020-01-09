package edu.graduation.b2cshoppingmall.service;

import edu.graduation.b2cshoppingmall.car.bean.Collect;

import java.util.List;

/**
 * 收藏夹的接口
 */
public interface CollectService {

    /**
     * 查询收藏夹的信息，分页展示
     * @param pageNumber 当前页数
     * @param pageSize 每页记录数
     * @return List<Collect>
     */
    List<Collect> queryAll(Integer pageNumber,Integer pageSize);

    /**
     * 添加一条收藏夹信息
     * @param collect
     * @return boolean
     */
    boolean addCollect(Collect collect);

    /**
     * 根据ID删除收藏夹信息
     * @param id
     * @return boolean
     */
    boolean delCollect(Integer id);

    /**
     * 更改一条原有收藏夹信息
     * @param collect
     * @return boolean
     */
    boolean updateCollect(Collect collect);
}
