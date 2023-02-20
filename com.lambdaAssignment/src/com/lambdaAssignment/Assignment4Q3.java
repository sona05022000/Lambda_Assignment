package com.lambdaAssignment;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Assignment4Q3 {
    static void modifyValue(){
        // Creating a Supplier functional interface
        Supplier<Integer> supplier = () -> 5;

        // Using the get() method of the Supplier to get the value
        Integer value = supplier.get();
        
        // At this point, value is equal to 5.

        // Creating a Predicate functional interface
        Predicate<Integer> predicate = n -> n % 2 == 0;

        // Using the test() method of the Predicate to check if the value is even
        boolean result = predicate.test(value);

        // At this point, result is equal to false since 5 is not even.

        // Creating a Function functional interface
        Function<Integer, Integer> function = n -> n * 2;

        // Using the apply() method of the Function to double the value
        Integer newValue = function.apply(value);

        // At this point, newValue is equal to 10 since we doubled the value of 5.

        // Creating a Consumer functional interface
        Consumer<Integer> consumer = n -> System.out.println("The value is: " + n);

        // Using the accept() method of the Consumer to display the new value
        consumer.accept(newValue);
    }

    static class Product {
        private String name;
        private double price;

        public Product(String name, double price) {
            this.name = name;
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public double getPrice() {
            return price;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setPrice(double price) {
            this.price = price;
        }
    }

    static void display() {
        // Creating a Supplier functional interface
        Supplier<Product> supplier = () -> new Product("Product 1", 10.0);

        // Using the get() method of the Supplier to get the Product
        Product product = supplier.get();

        // At this point, product is a new instance of the Product class with name "Product 1" and price 10.0.

        // Creating a Predicate functional interface
        Predicate<Product> predicate = p -> p.getPrice() > 5.0;

        // Using the test() method of the Predicate to check if the product price is greater than 5.0
        boolean result = predicate.test(product);

        // At this point, result is equal to true since the product price is 10.0 which is greater than 5.0.

        // Creating a Function functional interface
        Function<Product, String> function = p -> p.getName();

        // Using the apply() method of the Function to get the name of the product
        String productName = function.apply(product);

        // At this point, productName is equal to "Product 1".

        // Creating a Consumer functional interface
        Consumer<String> consumer = s -> System.out.println("The product name is: " + s);

        // Using the accept() method of the Consumer to display the product name
        consumer.accept(productName);
    }

    public static void main(String[] args) {
        modifyValue();
        display();
    }
}
/*This is because the program is using functional interfaces to perform various operations on an integer value.
 * First, a Supplier functional interface is created, which generates a value of 5. Then, a Predicate
 *functional interface is created, which tests whether the value is even. Since 5 is not even, the test returns false.
 *Next, a Function functional interface is created, which doubles the original value. The new value of 10
 *is returned by this function.

Finally, a Consumer functional interface is created, which simply prints the value to the console.The accept() method
 of the Consumer interface is called with the new value of 10, which is then printed to the console with the
  message "The value is: 10".
*/