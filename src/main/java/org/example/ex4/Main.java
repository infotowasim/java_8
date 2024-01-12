package org.example.ex4;

public class Main {
    public static void main(String[] args) {

        Runnable runnable = () -> {
            for (int i = 1; i <= 10; i++) {
                System.out.println("Hello " + i);
            }
        };
        Thread thread = new Thread(runnable);
        thread.run();
    }
}
