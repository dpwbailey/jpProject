/*
Programmer: Daniel Bailey
Description: Testing/main class
Date:12/5/2018
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {


  }

  // Step 15
  // Complete the header for the testCollection method here

  public ArrayList<Product> testCollection(ArrayList<Product> products) {

    AudioPlayer a1 = new AudioPlayer("iPod Mini", "MP3");
    AudioPlayer a2 = new AudioPlayer("Walkman", "WAV ");
    MoviePlayer m1 = new MoviePlayer("DBPOWER MK101", new Screen(" 720x480", 40, 22), MonitorType.LCD);
    MoviePlayer m2 = new MoviePlayer("Pyle PDV156BK",
        new Screen("1366x768", 40, 22), MonitorType.LED);

    // Write one line of code here to create the collection
    products = new ArrayList<>();
    products.add(a1);
    products.add(a2);
    products.add(m1);
    products.add(m2);
    return products;
  }

  // Step 16
  // Create print method here
  public static void print(ArrayList arrayList) {
    for (Object o : arrayList) {
      System.out.println(o + "\n");
    }

  }
public void processArrayList(){
  // Write one line of code to create an ArrayList of products
  ArrayList<Product> products = new ArrayList<>();
  // Write one line of code to call testCollection and assign the result to the ArrayList
  //products = testCollection();
  ArrayList<Product> products1 = testCollection(products);
  // Write one line of code to sort the ArrayList
  java.util.Collections.sort(products);
  // Call the print method on the ArrayList
  print(products);
}
  public static void AddProducts(String[] args) {
    Scanner scan = new Scanner(System.in);
    ArrayList<Product> products = new ArrayList<>();
    System.out.println("Enter a number of products to add: ");

    for (int productNumber = scan.nextInt(); productNumber > 0; productNumber--) {
      // Product product = new Product() {

    }
  }
}


