package com.company;

class Parent {

    void Print()
    {
        System.out.println("parent class");
    }
}

class subclass1 extends Parent {

    void Print() {
        System.out.println("subclass1");
    }
}

class subclass2 extends Parent {

    void Print()
    {
        System.out.println("subclass2");
    }
}

public class RunTimePolymorphism {

    public static void main(String[] args)
    {
        Parent parRef;

        parRef= new subclass1();
        parRef.Print();

        parRef= new subclass2();
        parRef.Print();
    }
}
