package edu.graduation.b2cshoppingmall.member.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 浏览记录
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class History {

    /**
     * 浏览记录id
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
     * 父类别编号
     */
    private int parentId;

    /**
     * 是否删除
     */
    private String isDelete;
}
