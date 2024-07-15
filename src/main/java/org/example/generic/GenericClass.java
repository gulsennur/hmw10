package org.example.generic;

 public class GenericClass<T> {
    private T value;

    public GenericClass(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public void displayValue() {
        System.out.println("Value: " + value);
    }
}

