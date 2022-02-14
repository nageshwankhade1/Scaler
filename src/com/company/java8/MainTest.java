package com.company.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class MainTest {



    public static void main(String[] args) {
        Function<Integer, Integer> function = new MyFunctionalInterface();

        System.out.println(function.apply(5));
        Function<Integer, Integer> func = (value) -> value+2;
        System.out.println(func.apply(2));


        List<String> stringList = new ArrayList<String>();

        stringList.add("One flew over the cuckoo's nest");
        stringList.add("To kill a muckingbird");
        stringList.add("Gone with the wind");

        Stream<String> stream = stringList.stream();

        stream.flatMap((value) -> {
            String[] split = value.split(" ");
            return (Stream<String>) Arrays.asList(split).stream();
        })
                .forEach((value) -> System.out.println(value));

        List<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);

        //nums.stream().flatMapToInt(n).forEach(System.out::println);


    }
}
