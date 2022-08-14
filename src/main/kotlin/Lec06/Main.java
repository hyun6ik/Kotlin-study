package Lec06;

import java.util.Arrays;
import java.util.List;

public class Main {

    private void forEachInJava() {
        final List<Long> numbers = Arrays.asList(1L, 2L, 3L);
        for (Long number : numbers) {
            System.out.println(number);
        }
    }

    private void originalFor() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(i);
        }

        for (int i = 1; i <= 5; i += 2) {
            System.out.println(i);
        }
    }

    private void originalForDown() {
        for (int i = 3; i >= 1; i--) {
            System.out.println(i);
        }
    }

    private void originalWhile() {
        int i = 1;
        while (i <= 3) {
            System.out.println(i);
            i++;
        }
    }
}
