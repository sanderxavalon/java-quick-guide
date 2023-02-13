package com.sanderxavalon;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream {

    public static void main(String[] args) {

        // filter：透過設定的條件過濾元素。
        List<String> strings = Arrays.asList("小狗", "", "小貓", "小豬", "小鳥","");
        // 獲取非空字串數量
        // 以前需要用Forloop然後再補上操作邏輯，現在一行就可以了
        long animalCount = strings.stream().filter(string -> !string.isEmpty()).count();

        // map：映射每个元素到對應的結果。
        List<Double> numbers = Arrays.asList(4.0, 9.0, 16.0, 25.0, 36.0, 49.0);
        //將每個元素開根號
        List<Double> sqrtList = numbers.stream().map( num -> Math.sqrt(num)).collect(Collectors.toList());

        // forEach： 迭代Stream中的每個元素。
        List<String> people = Arrays.asList("小明", "小王", "小呆","小誠");
        people.stream().forEach(System.out::println);

        // reduce： 在群集中透過連接動作將元素匯總成單一結果。
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);
        //將列表元素加總
        Integer sum = integers.stream().reduce(0, (a, b) -> a + b);
    }
}
