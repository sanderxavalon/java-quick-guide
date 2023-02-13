package com.sanderxavalon;

import java.util.*;

public class SetExample {
    public static void main( String[] args ) {
        /*
            Set特型
            - 不可以重複
            - Nullable，但只有一個
            - 沒有順序
         */
        Set<String> set = new HashSet<String>();

        set.add("AAA");
        set.add("AAA");
        set.add("BBB");
        set.add("BBB");
        set.add("CCC");
        set.add("CCC");
        set.add(null);

        // 不能用forloop，只能調用Iterator

        Iterator<String> iterator = set.iterator();

        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Enhanced Forloop
        for (String var : set) {
            System.out.println(var);
        }
    }

}
