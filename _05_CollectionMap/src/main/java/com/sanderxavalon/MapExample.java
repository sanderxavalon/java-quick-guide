package com.sanderxavalon;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapExample {
    public static void main(String[] args) {
         /*
            Map特型
            - Key不可以重複，重複會取代之前的值git
            - Nullable，Key只能有一個，Value則可以多個
            - Key-value資料結構
         */
        Map<String, String> map = new HashMap<String, String>();

        map.put("AAA", "AAA");
        map.put("BBB", "BBB");
        map.put("CCC", "CCC");

        // 這個會把AAA取代
        map.put("AAA", "ABC");

        // Key只能有一個null
        map.put(null, "This is null");
        map.put(null, "This will replace");

        // Value有多個null
        map.put("null1", null);
        map.put("null2", null);

        // 一樣不能用Forloop，需要從map拿出entryset
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.printf("Key:%s, Value:%s\n", entry.getKey(), entry.getValue());
        }

        // Enhance Forloop 只跑所有key
        for (String key : map.keySet()) {
            System.out.println("Only key:" + key);
        }

        // Enhance Forloop 只跑所有value
        for (String value : map.values()) {
            System.out.println("Only value:" + value);
        }

    }
}
