package edu.graduation.b2cshoppingmall.address.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Provinces {

    //省id
    private int id;

    //省编号
    private String provinceId;

    //省名
    private String province;
}
