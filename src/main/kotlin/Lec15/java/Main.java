package Lec15.java;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        // 1. Array

        int[] array = {100, 200};
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%s %s", i, array[i]);
        }

        // 2. List

        final List<Integer> numbers = Arrays.asList(100, 200);

        // 하나를 가져오기
        System.out.println(numbers.get(0));

        // For Each
        for (Integer number : numbers) {
            System.out.println(number);
        }

        for (int i = 0; i < numbers.size(); i++) {
            System.out.printf("%s %s", i, numbers.get(i));
        }

        // 3. Map

        final HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "MONDAY");
        map.put(2, "TUESDAY");

        final Map<Integer, String> jdk9Map = Map.of(1, "MONDAY", 2, "TUESDAY");
    }
}
