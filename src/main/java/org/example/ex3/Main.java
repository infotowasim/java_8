package org.example.ex3;

public class Main {
    public static void main(String[] args) {

        MyClass myClass = new MyClass();
        Thread thread = new Thread(myClass);
        thread.run();

    }
}
