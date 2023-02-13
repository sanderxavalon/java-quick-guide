package com.sanderxavalon;

public class FlowControl {
    public static void main(String[] args) {

        // if
        if (true) {
            System.out.println("Your java program works fine.");
        } else {
            System.out.println("Man you're in trouble if you see this.");
        }

        // switch
        switch (1) {
            // 記得要加上break，要不然會一直跑下去
            case 1:
                System.out.println("Your java program works fine.");
                break;
            case 2:
                System.out.println("Man you're in trouble if you see this.");
                break;
            default:
                System.out.println("It only works when no match");
        }

        // for
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        // while
        while (true) {
            System.out.println("Your java program works fine.");
            break;
        }
    }
}