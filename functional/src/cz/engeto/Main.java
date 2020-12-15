package cz.engeto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.DoubleToIntFunction;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] result;

        // first
        result = filterGraterThen(5, array);
        System.out.println(Arrays.toString(result));

        // with external filter
        result = arrayFilter(array, value -> value > 5);

        result = arrayFilter(array, value -> value < 6);

        Function<Integer, Integer> increment = value -> value + 1;
        Integer val = increment.apply(1);

        Runnable printHello = Main::printHello;
        runner(printHello);
    }

    public static void runner(Runnable runnable) {
        runnable.run();
    }

    public static void printHello() {
        System.out.println("Hello");
    }

    public static int[] filterGraterThen(int threshold, int[] array) {
        if (array == null) {
            return new int[0];
        }

        int[] result = new int[array.length];

        int cnt = 0;
        for (int val : array) {
            if (val > threshold) {
                result[cnt] = val;
                cnt++;
            }
        }

        return Arrays.copyOfRange(result, 0, cnt);
    }

    public static int[] arrayFilter(int[] array, Predicate<Integer> filter) {
        if (array == null) {
            return new int[0];
        }

        int[] result = new int[array.length];

        int cnt = 0;
        for (int val : array) {
            if (filter.test(val)) {
                result[cnt] = val;
                cnt++;
            }
        }

        return Arrays.copyOfRange(result, 0, cnt);
    }
}
