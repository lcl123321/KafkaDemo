package com.lcl.kafkademo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data//生成getter,setter ,toString等函数
@NoArgsConstructor//生成无参构造函数
@AllArgsConstructor//生成全参数构造函数
@TableName("user")
public class User {
    @TableId(value = "id",type = IdType.AUTO)
    private Integer  id;
    @TableField("username")
    private String username;
    @TableField("password")
    private int password;
}
