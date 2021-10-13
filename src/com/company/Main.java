package com.company;

import java.util.*;
import java.util.stream.Stream;


public class Main {

    public static void main(String[] args) {

        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        intList.sort(Comparator.naturalOrder());
        
        List<Integer> positive = new ArrayList<>();
        List<Integer> divide2 = new ArrayList<>();

        System.out.println(intList);

        for (int i = 0; i < intList.size() ; i++) {
            if (intList.get(i) > 0) { positive.add(intList.get(i));
            }
        }
        System.out.println(positive);

        for (int i = 0; i < positive.size() ; i++) {
            if (positive.get(i) % 2 == 0) { divide2.add(positive.get(i));
            }
        }
        System.out.println(divide2);


        Stream<Integer> stream = intList.stream();
        stream.filter(x -> x > 0)
              .filter(x -> x % 2 == 0)
              .sorted(Comparator.naturalOrder())
              .forEach(System.out::println)  ;


    }
}
