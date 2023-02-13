package com.sanderxavalon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Hello world!
 *
 */
public class CheckedException
{
    public static void main(String[] args) {
        try {
            BufferedReader buf = new BufferedReader(
                    new InputStreamReader(System.in));
            System.out.print("請輸入整數: ");
            int input = Integer.parseInt(buf.readLine());
            System.out.println("input x 10 = " + (input*10));
        }
        // IOException 為受檢例外，一定要處裡
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
