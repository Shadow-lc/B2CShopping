package edu.graduation.b2cshoppingmall.address.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Cities {

    //市id
    private int id;

    //市编号
    private String cityId;

    //市名
    private String province;

    //省编号
    private String provinceId;
}
