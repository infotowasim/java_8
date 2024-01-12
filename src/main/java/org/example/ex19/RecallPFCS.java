package org.example.ex19;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class RecallPFCS {

    public static void main(String[] args) {

        Predicate<Integer> integerPredicate = x->x%2==0;
        Function<Integer,Integer> integerIntegerFunction = y->y*y;
        Consumer<Integer> integerConsumer = c-> System.out.println(c);
        Supplier<Integer> integerSupplier = ()->100;

        if (integerPredicate.test(integerSupplier.get())){
            integerConsumer.accept(integerIntegerFunction.apply(integerSupplier.get()));
        }
    }
}
