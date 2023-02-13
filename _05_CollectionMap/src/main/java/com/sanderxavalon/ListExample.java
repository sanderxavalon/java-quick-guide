package com.sanderxavalon;

import java.util.ArrayList;
import java.util.List;

public class ListExample {

    public static void main( String[] args ) {
        /*
            List特型
            - 可以重複
            - Nullable
            - 依照插入順序
         */
        List<String> list = new ArrayList<String>();
        list.add("AAA");
        list.add("AAA");
        list.add("BBB");
        list.add("BBB");
        list.add("CCC");
        list.add("CCC");
        list.add(null);

        // Normal Forloop
        for (int i = 0; i < list.size(); i++ ){
            System.out.println(list.get(i));
        }

        // Enhanced Forloop
        for (String var : list) {
            System.out.println(var);
        }
    }
}
