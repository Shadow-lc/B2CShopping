package edu.graduation.b2cshoppingmall.service;

import edu.graduation.b2cshoppingmall.address.bean.Address;
import edu.graduation.b2cshoppingmall.address.bean.Areas;
import edu.graduation.b2cshoppingmall.address.bean.Cities;
import edu.graduation.b2cshoppingmall.address.bean.Provinces;

import java.util.List;

/**
 * 关于地址的接口
 * （Address、Areas、Cities、Provinces）
 */
public interface AddressService {

    /**
     * 查询所有的省
     * @return List<Provinces>
     */
    List<Provinces> queryProvinces();

    /**
     * 根据省编号查询所有城市
     * @param id 省编号
     * @return List<Areas>
     */
    List<Cities> queryCitiesById(String id);

    /**
     * 根据市编号查询所有区
     * @param id 市编号
     * @return List<Areas>
     */
    List<Areas> queryAreasById(String id);

    /**
     * 查询所有的收获地址的总数
     * @return Integer
     */
    Integer getCount();

    /**
     * 查询所有的收货地址
     * @return List<Address>
     */
    List<Address> queryAllAddress();

    /**
     * 添加一条收货地址信息
     * @param address
     * @return boolean
     */
    boolean addAddress(Address address);

    /**
     * 根据ID删除一条Address
     * @param id
     * @return boolean
     */
    boolean delAddress(Integer id);

    /**
     * 修改一条已存在的收货地址信息
     * @param address
     * @return boolean
     */
    boolean updateAddress(Address address);

}
