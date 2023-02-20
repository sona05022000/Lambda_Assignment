package com.lambdaAssignment;
import java.util.HashMap;
import java.util.Map;

public class Assignment4Q7 {
    public static void main(String[] args) {
        // create a HashMap and add some key-value pairs
        HashMap<String, Integer> map = new HashMap<>();
        map.put("John", 25);
        map.put("Jane", 30);
        map.put("Jim", 35);
        
        // create an instance of the class and call the convertKeyValueToString method
        String result = new Assignment4Q7().convertKeyValueToString(map);
        
        // print the resulting string
        System.out.println(result);
    }

    public String convertKeyValueToString(HashMap<String, Integer> map) {
        // create a StringBuilder object to build the resulting string
        StringBuilder sb = new StringBuilder();
        
        // iterate through each entry in the map and append its key and value to the StringBuilder
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            sb.append(entry.getKey());
            sb.append(":");
            sb.append(entry.getValue());
            sb.append(" ");
        }
        
        // return the final string
        return sb.toString();
    }
}
