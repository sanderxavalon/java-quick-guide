package com.sanderxavalon;


public class FirstApp {
    public static void main(String[] args) {

        throwsTest();
    }

    private static void throwsTest() throws ArithmeticException {
        System.out.println("這只是一個測試");
        // 程式處理過程假設發生例外
        throw new ArithmeticException();
    }
}
