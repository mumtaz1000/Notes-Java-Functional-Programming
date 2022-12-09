package functionalinterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {
    public static void main(String[] args) {
        int increment = incrementByOneFunction.apply(1);
        System.out.println(increment);

        System.out.println(incrementByOneAndMultiplyTen.apply(2));

        System.out.println(incrementByOneAndMultiplyFunction.apply(1,3));
    }

    static Function<Integer, Integer> incrementByOneFunction = number -> ++number;

    static Function<Integer, Integer> multiplyByTen = number -> number * 10;

    static Function<Integer, Integer> incrementByOneAndMultiplyTen = incrementByOneFunction.andThen(multiplyByTen);

    static BiFunction<Integer, Integer, Integer> incrementByOneAndMultiplyFunction =
        (numberToIncrementByOne, numberToMultiply) -> (numberToIncrementByOne + 1) * numberToMultiply;
}
