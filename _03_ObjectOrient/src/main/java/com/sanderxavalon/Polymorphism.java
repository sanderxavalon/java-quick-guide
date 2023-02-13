package com.sanderxavalon;

// 除了繼承以外，可以藉由介面抽象相同的行為
// 並把細節留給類別實作
public class Polymorphism {

    public static void main(String[] args) {
        flyable airplane = new Airplane();
        flyable bird = new Bird();

        airplane.fly();
        bird.fly();
    }
}

interface flyable {
    void fly();
}

class Airplane implements flyable{
    @Override
    public void fly() {
        System.out.println("The airplane is flying");
    }
}

class Bird implements flyable{
    @Override
    public void fly() {
        System.out.println("The bird is flying");
    }
}