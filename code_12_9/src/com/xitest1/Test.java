package com.xitest1;

public class Test {
    public static void main(String[] args) {
        Frog f = new Frog("Frog",10);
        Sheep s = new Sheep("Sheep",11);
        Dog d = new Dog("Dog",12);
        f.eat();
        f.drink();
        s.eat();
        s.drink();
        d.eat();
        d.drink();

    }
}
