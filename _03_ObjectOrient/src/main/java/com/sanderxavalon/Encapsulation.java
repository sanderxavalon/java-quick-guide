package com.sanderxavalon;

// 封裝就是把細節鎖定在類別內部，對外只需存取到結果就好
// 像是成本的計算，其他的類別不需要知道細節
// 只需要開一個可以調用的方法getPrice()拿到結果即可
public class Encapsulation {

    private Integer cost;
    private Integer price;

    public Encapsulation(Integer cost) {
        this.cost = cost;
    }

    private void calculatePrice(){
        this.price = this.cost * 20;
    }

    public Integer getPrice(){
        this.calculatePrice();
        return this.price;
    }

}
