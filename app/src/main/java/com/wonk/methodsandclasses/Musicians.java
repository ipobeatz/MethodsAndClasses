package com.wonk.methodsandclasses;

class Musicians {
    String name = "kobe";
    String instrument;
    int age;

    public Musicians(String name, String instrument, Integer age) {
        this.name = name;
        this.instrument = instrument;
        this.age = age;
        System.out.println("constructor called");

        String x = "9";
    }
}
