package com.haizhi.graph.common.json;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by chengmo on 2018/4/12.
 */
public class JSONUtils {

    public static <T> Map<String, Object> toMap(T bean) {
        String text = JSON.toJSONString(bean);
        return JSON.parseObject(text, new TypeReference<Map<String, Object>>() {});
    }

    public static <T> List<Map<String, Object>> toListMap(List<T> beanList) {
        String text = JSON.toJSONString(beanList);
        return JSON.parseObject(text, new TypeReference<List<Map<String, Object>>>() {});
    }

    public static Map<String, Object> jsonToMap(String json) {
        return JSON.parseObject(json, new TypeReference<Map<String, Object>>() {
        });
    }

    public static List<Map<String, Object>> jsonToListMap(String json) {
        return JSON.parseObject(json, new TypeReference<List<Map<String, Object>>>() {
        });
    }

    public static List<Map<String, Object>> toListMap(Object obj) {
        String json = JSON.toJSONString(obj);
        return JSON.parseObject(json, new TypeReference<List<Map<String, Object>>>() {
        });
    }

    public static <From, To> To copy(From bean, Class<To> toClass){
        return JSON.parseObject(JSON.toJSONString(bean), toClass);
    }

    public static <From, To> List<To> copy(List<From> beanList, Class<To> toClass){
        List<To> toBeanList = new ArrayList<>();
        beanList.stream().forEach( e -> {
            toBeanList.add(copy(e, toClass));
        });
        return toBeanList;
    }

    public static <T> void println(T object) {
        System.out.println(JSON.toJSONString(object, true));
    }
}
