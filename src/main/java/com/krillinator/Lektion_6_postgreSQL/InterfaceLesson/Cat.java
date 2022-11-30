package com.krillinator.Lektion_6_postgreSQL.InterfaceLesson;

public class Cat implements Animal {


    @Override
    public void sayHello() {
        System.out.println("Meow");
    }

    @Override
    public String throwSomething() {
        return "dirt";
    }

    @Override
    public void eat() {
        System.out.println("Eating");
    }
}
