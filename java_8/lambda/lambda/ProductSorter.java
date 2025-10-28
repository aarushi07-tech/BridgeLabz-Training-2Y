package lambda;
//File: ProductSorter.java

import java.util.*;

class Product {
 String name;
 double price;
 double rating;
 double discount;

 public Product(String name, double price, double rating, double discount) {
     this.name = name;
     this.price = price;
     this.rating = rating;
     this.discount = discount;
 }

 @Override
 public String toString() {
     return String.format("%s | ₹%.2f | ⭐%.1f | %.0f%% off", name, price, rating, discount);
 }
}

public class ProductSorter {

 public static void main(String[] args) {
     List<Product> products = Arrays.asList(
         new Product("Smartphone", 29999, 4.5, 10),
         new Product("Laptop", 59999, 4.7, 15),
         new Product("Headphones", 1999, 4.2, 25),
         new Product("Smartwatch", 9999, 4.0, 20)
     );

     // Sort by price (ascending)
     System.out.println("🔹 Sorted by Price:");
     products.sort((p1, p2) -> Double.compare(p1.price, p2.price));
     products.forEach(System.out::println);

     // Sort by rating (descending)
     System.out.println("\n🔹 Sorted by Rating:");
     products.sort((p1, p2) -> Double.compare(p2.rating, p1.rating));
     products.forEach(System.out::println);

     // Sort by discount (descending)
     System.out.println("\n🔹 Sorted by Discount:");
     products.sort((p1, p2) -> Double.compare(p2.discount, p1.discount));
     products.forEach(System.out::println);
 }
}

