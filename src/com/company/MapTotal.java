package com.company;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapTotal {

    public void Method() {
        /*LinkedHashMap按添加顺序遍历*/
        HashMap<String, Object> hashMap = new LinkedHashMap<>();
        hashMap.put("张飞", 11);
        hashMap.put("关羽", 12);
        hashMap.put("刘备", 13);
        hashMap.put("赵云", 14);
        hashMap.put("诸葛亮", 15);

        System.out.println(hashMap.size());
        System.out.println(hashMap.containsKey("曹操"));
        System.out.println(hashMap.containsValue(11));

        if (hashMap.containsKey("曹操")) {
            System.out.println(hashMap.containsKey("曹操"));
        } else {
            hashMap.put("曹操", 16);
        }



        /* entry遍历*/
        for (
                java.util.Map.Entry<String, Object> entry : hashMap.entrySet()) {
            System.out.println("key:" + entry.getKey() + "--value:" + entry.getValue());
        }

        /*iterator遍历*/
        Iterator iterator = hashMap.entrySet().iterator();
        while (iterator.hasNext()) {
            java.util.Map.Entry<String, Object> entry = (java.util.Map.Entry<String, Object>) iterator.next();
            System.out.println("key:" + entry.getKey() + "---value:" + entry.getValue());
        }
    }
}
