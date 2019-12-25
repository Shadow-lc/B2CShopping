package edu.graduation.b2cshoppingmall.address.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Areas {

    //区id
    private int id;

    //区编号
    private String areaId;

    //区名
    private String area;

    //市编号
    private String cityId;
}
