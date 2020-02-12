package com.shopping.studydemo.util;

import com.exceptions.UnloginException;
import org.slf4j.MDC;

/**
 * @author: wqk
 * 用户信息工具类，保存用户信息到threadlocal，方便打印日志
 *
 */
public class UserInfoUtil {

    private final static ThreadLocal<Object> TLUSER = new ThreadLocal<Object>();

    /**
     * 同放入session的用户信息Key
     */
    public static final String KEY_USER = "sysUser";

    public static void setUser(Object user) {
        TLUSER.set(user);
        // 把需要打印日志的用户信息放到slf4j MDC
        MDC.put(KEY_USER, user.toString());
    }

    /**
     * 如果没有登录会抛出异常
     * @return
     */
    public static Object getUser() {
        Object user = TLUSER.get();

        if (user == null) {
            throw new UnloginException(AbstractResult.SYSTEM_FAIL,"user unlogin");
        }

        return user;
    }

    /**
     * 如果没有登录，返回null
     * @return
     */
    public static Object getUserIfLogin() {
        return TLUSER.get();
    }

    /**
     * 清空用户信息
     * */
    public static void clearAllUserInfo() {
        TLUSER.remove();
        MDC.remove(KEY_USER);
    }
}
