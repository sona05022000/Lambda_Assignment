package com.lambdaAssignment;
import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;

public class Assignment4Q6 {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple", "banana", "orange", "grape", "mango");

        System.out.println("Original List: " + list);

        List<String> upperCaseList = convertToUpperCase(list);

        System.out.println("List after converting to upper case: " + upperCaseList);
    }

    public static List<String> convertToUpperCase(List<String> list) {
        UnaryOperator<String> upperCaseOperator = s -> s.toUpperCase();
        list.replaceAll(upperCaseOperator);
        return list;
    }
}
