package com.company.java8;

import java.util.function.Function;

public class MyFunctionalInterface implements Function<Integer, Integer> {


    @Override
    public Integer apply(Integer num) {
        return num+3;
    }
}
