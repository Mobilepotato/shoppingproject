package com.shopping.studydemo.util;

import java.util.UUID;

/**
 * @author: wqk
 * UUID工具类
 *
 */
public class UUIDUtil {

    /**
     * 产生紧凑型32位UUID
     * @return
     */
    public static String getUuid(){
        UUID uuid = UUID.randomUUID();
        return uuid.toString().replaceAll("-", "");
    }
}
