package test;

import main.java.MainFuncs;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import java.io.IOException;
import java.util.List;

public class Testing {
    private static List<Integer> numberList;

    @BeforeAll
    public static void initialize() throws IOException {
        numberList = MainFuncs.loadNumbersFromFile("src/main/resources/numbers.txt");
    }

    @Test
    public void testFindMinimum() {
        int minValue = MainFuncs.findMinimum(numberList);
        Assertions.assertEquals(1, minValue);
    }

    @Test
    public void testFindMaximum() {
        int maxValue = MainFuncs.findMaximum(numberList);
        Assertions.assertEquals(20, maxValue);
    }

    @Test
    public void testCalculateSum() {
        int sumValue = MainFuncs.calculateSum(numberList);
        Assertions.assertEquals(210, sumValue);
    }

    @Test
    public void testCalculateProduct() {
        long productValue = MainFuncs.calculateProduct(numberList);
        Assertions.assertEquals(2432902008176640000L, productValue);
    }

    @Test
    public void testCalculateProductPerformance() {
        Assertions.assertTimeoutPreemptively(java.time.Duration.ofNanos(100), () -> {
            MainFuncs.calculateProduct(numberList);
        });
    }
}
