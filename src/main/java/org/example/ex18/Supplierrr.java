package org.example.ex18;


import java.util.function.Supplier;

public class Supplierrr {
    public static void main(String[] args) {

        Supplier<Integer> integerSupplier = ()->100;
        System.out.println(integerSupplier.get());

        Supplier<String> stringSupplier = ()->"Mithu";
        System.out.println(stringSupplier.get());
    }
}
