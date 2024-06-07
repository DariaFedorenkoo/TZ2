package main.java;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MainFuncs {
    public static List<Integer> loadNumbersFromFile(String filePath) throws IOException {
        List<Integer> numberList = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String[] numberStrings = reader.readLine().split(" ");
            for (String numStr : numberStrings) {
                numberList.add(Integer.parseInt(numStr));
            }
        }
        return numberList;
    }

    public static int findMinimum(List<Integer> numberList) {
        int minimum = numberList.get(0);
        for (int num : numberList) {
            minimum = Math.min(minimum, num);
        }
        return minimum;
    }

    public static int findMaximum(List<Integer> numberList) {
        int maximum = numberList.get(0);
        for (int num : numberList) {
            maximum = Math.max(maximum, num);
        }
        return maximum;
    }

    public static int calculateSum(List<Integer> numberList) {
        int res = 0;
        for (int num : numberList) {
            res += num;
        }
        return res;
    }

    public static long calculateProduct(List<Integer> numberList) {
        long res = 1;
        for (int num : numberList) {
            res *= num;
        }
        return res;
    }
}
