package com.lambdaAssignment;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Assignment4Q5 {
    static List<String> list = Arrays.asList("alpha", "bravo", "charlie", "delta", "echo", "foxtrot");

    public static void main(String[] args) {
        String result = processWords(list);
        System.out.println(result);
    }

    public static String processWords(List<String> list) {
        StringBuilder result = new StringBuilder();
        Consumer<String> addFirstLetter = s -> result.append(s.charAt(0));
        list.forEach(addFirstLetter);
        return result.toString();
    }
}

