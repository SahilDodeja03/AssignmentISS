package com.company;
abstract class Animal {

    public abstract void animalSound();

    public void sleep() {
        System.out.println("The pig sleeps like: Zzz");
    }
}

class Pig extends Animal {
    public void animalSound() {
        System.out.println("The pig says: wee wee");
    }
}

public class Abstarct {

    public static void main(String[] args) {
        Pig myPig = new Pig();
        myPig.animalSound();
        myPig.sleep();
    }
}
