package com.mgtv.tutorials.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CommonResult<T> {
    private Integer code;
    private String message;
    private T data;


    // 默认空data的构造函数
    public CommonResult(Integer code, String msg) {
        this (code, msg, null);
    }

}
