package com.haige2.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.text.SimpleDateFormat;

/**
 * @className: com.haige.utils-> JsonUtils
 * @description:
 * @author: cqh
 * @createDate: 2021-06-03 20:23
 * @version: 1.0
 * @todo:
 */
public class JsonUtils {

    public static String getJson(Object object){
        return getJson(object,"");
    }


    public static String getJson(Object object,String DateFormat){
        ObjectMapper mapper = new ObjectMapper();

        // 不适用时间戳的方式
        mapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS,false);
        //yyyy-MM-dd HH:mm:ss
        SimpleDateFormat sdf = new SimpleDateFormat(DateFormat);
        mapper.setDateFormat(sdf);

        try {
            return mapper.writeValueAsString(object);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return null;
    }
}
