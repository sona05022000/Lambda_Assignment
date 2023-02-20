package com.lambdaAssignment;
import java.util.ArrayList;
import java.util.Arrays;

public class Assignment4Q4 {

    public  ArrayList<String> removeOddLength(ArrayList<String> employeeList) {
        employeeList.removeIf(str -> str.length() % 2 != 0);
        return employeeList;
    }

    public static void main(String[] args) {
    	 Assignment4Q4 obj = new Assignment4Q4();
         ArrayList<String> employeeList = new ArrayList<>();
         employeeList.add("apple");
         employeeList.add("banana");
         employeeList.add("cherry");
         employeeList.add("date");
         employeeList.add("elderberry");
         System.out.println("Before removing odd-length words: " + employeeList);
         ArrayList<String> filteredList = obj.removeOddLength(employeeList);
         System.out.println("After removing odd-length words: " + filteredList);
    }
}
