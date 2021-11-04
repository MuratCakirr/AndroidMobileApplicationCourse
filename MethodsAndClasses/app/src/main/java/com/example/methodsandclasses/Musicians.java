package com.example.methodsandclasses;

public class Musicians {
    String name;
    private int age;
    String instrument;

    public Musicians(String name, int age, String instrument) {
        this.name = name;
        this.age = age;
        this.instrument = instrument;
        System.out.println("constructor called");
        System.out.println(age);
    }

    public String getName() {
        return name;
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

    public String getInstrument() {
        return instrument;
    }

    public void setInstrument(String instrument) {
        this.instrument = instrument;
    }
}
