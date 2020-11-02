package br.com.aab.lambda;

import java.util.function.Function;

public class MyFunctionalInterfaceExamples {

    public Integer addingTwoValues(Integer a, Integer b) {
        Function<Integer, Integer> result = i -> i + b;
        return result.apply(a);
    }

    public Integer addingAndMultiplingTwoValues(Integer a) {
        Function<Integer, Integer> adding = i -> i + 10;
        Function<Integer, Integer> multipling = i -> i * 5;

        return adding.compose(multipling).apply(a);
    }
}
