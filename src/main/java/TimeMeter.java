package main.java;

import java.io.IOException;
import java.util.List;

public class TimeMeter {
    public static void main(String[] args) throws IOException {
        List<Integer> numbers = MainFuncs.loadNumbersFromFile("src/main/resources/numbers.txt");

        long startTime, endTime, exectime;

        startTime = System.nanoTime();
        int minValue = MainFuncs.findMinimum(numbers);
        endTime = System.nanoTime();
        exectime = endTime - startTime;
        System.out.println("time of findMinimum: " + exectime + " ns");

        startTime = System.nanoTime();
        int maxValue = MainFuncs.findMaximum(numbers);
        endTime = System.nanoTime();
        exectime = endTime - startTime;
        System.out.println("time of findMaximum: " + exectime + " ns");

        startTime = System.nanoTime();
        int sumValue = MainFuncs.calculateSum(numbers);
        endTime = System.nanoTime();
        exectime = endTime - startTime;
        System.out.println("time of calculateSum: " + exectime + " ns");

        startTime = System.nanoTime();
        long productValue = MainFuncs.calculateProduct(numbers);
        endTime = System.nanoTime();
        exectime = endTime - startTime;
        System.out.println("time of calculateProduct: " + exectime + " ns");
    }
}
