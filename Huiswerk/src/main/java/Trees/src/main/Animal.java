package main;

public class Animal<T extends Comparable<T>>{
    String name;

    public String getValue() {
        return name;
    }

    public void setValue(T value) {
        this.name = name;
    }

}
