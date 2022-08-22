package Lec17.java;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        final List<Fruit> fruits = Arrays.asList(
                new Fruit("사과", 1_000),
                new Fruit("사과", 1_000),
                new Fruit("사과", 1_200),
                new Fruit("사과", 1_200),
                new Fruit("사과", 1_500),
                new Fruit("바나나", 3_000),
                new Fruit("바나나", 3_200),
                new Fruit("바나나", 2_500),
                new Fruit("수박", 10_000)
        );
    }

    private List<Fruit> findFruitsWithName(List<Fruit> fruits, String name) {
        return fruits.stream()
                .filter(fruit -> fruit.getName().equals(name))
                .collect(Collectors.toUnmodifiableList());
    }
}
