package com.shopping.studydemo.util.system;

import net.sf.json.JSONObject;

public class CommonUtil {


    /**
     * 返回错误信息
     * @param errorEnum
     * @return
     */
    public static JSONObject errorJson(ErrorEnum errorEnum){
        JSONObject resultJson=new JSONObject();
        resultJson.put("code",errorEnum.getErrorCode());
        resultJson.put("msg",errorEnum.getErrorMsg());
        resultJson.put("info",new JSONObject());
        return resultJson;

    }
}
