package com.lambdaAssignment;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Assignment4Q8 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        Thread printThread = new Thread(() -> {
            Consumer<Integer> printConsumer = System.out::println;
            numbers.forEach(printConsumer);
        });

        printThread.start();
    }
}
