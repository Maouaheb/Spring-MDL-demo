package com.example.demo;

public class PersonForm {
    private int age;
    private String name;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "Person(Name: "+this.name+ ", Age: "+this.age+")";
    }
}
