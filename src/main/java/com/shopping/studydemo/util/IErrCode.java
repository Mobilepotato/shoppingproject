package com.shopping.studydemo.util;


/**
 * 错误码封装
 * @author gameloft9 2017-11-10
 * */
public interface IErrCode {
    /**
     * 获取code
     * @return
     */
    String getCode();

    /**
     * 获取desc
     * @return
     */
    String getDesc();

    /**
     * 将内容toString
     * @return
     */
    @Override
    String toString();
}
