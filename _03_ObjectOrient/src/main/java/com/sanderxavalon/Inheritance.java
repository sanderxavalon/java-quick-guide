package com.sanderxavalon;

// 繼承可以減少相同方法或是變數散落在各個不同的類別
// 可以將相同邏輯抽象後做為父類別在進行繼承
public class Inheritance {

    public static void main(String[] args) {

        // Dog與Cat都繼承Animal，都可以使用walk()
        Dog dog = new Dog();
        dog.walk();
        dog.bark();

        Cat cat = new Cat();
        cat.walk();
        cat.meow();
    }
}


class Animal {
    public void walk(){
        System.out.println("walking");
    };
}

class Dog extends Animal {
    public void bark(){
        System.out.println("bark!");
    }
}

class Cat extends Animal {
    public void meow(){
        System.out.println("meow!");
    }
}
