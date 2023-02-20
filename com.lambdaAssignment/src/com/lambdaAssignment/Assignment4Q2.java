package com.lambdaAssignment;
import java.util.ArrayList;

public class Assignment4Q2 {

    private int totalPrice;
    private String status;

    public Assignment4Q2(int totalPrice, String status) {
        this.totalPrice = totalPrice;
        this.status = status;
    }

    public static ArrayList<Assignment4Q2> listOfOrders(ArrayList<Assignment4Q2> orders) {
        ArrayList<Assignment4Q2> filteredOrders = new ArrayList<>();
        orders.forEach(order -> {
            if (order.totalPrice > 10000 && (order.status.equals("ACCEPTED") || order.status.equals("COMPLETED"))) {
                filteredOrders.add(order);
            }
        });
        return filteredOrders;
    }

    public static void main(String[] args) {
        ArrayList<Assignment4Q2> orders = new ArrayList<>();
        orders.add(new Assignment4Q2(12000, "ACCEPTED"));
        orders.add(new Assignment4Q2(8000, "COMPLETED"));
        orders.add(new Assignment4Q2(15000, "PENDING"));
        orders.add(new Assignment4Q2(9000, "ACCEPTED"));

        ArrayList<Assignment4Q2> filteredOrders = listOfOrders(orders);
        filteredOrders.forEach(order -> System.out.println("Total Price: " + order.totalPrice + ", Status: " + order.status));
    }
}
