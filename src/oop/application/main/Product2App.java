package oop.application.main;

import java.util.HashSet;
import java.util.Set;

import oop.application.method.Product2;

public class Product2App {
  public static void main(String[] args) {
    Product2 product = new Product2("Macbook Pro M2", 19000000);
    Product2 product1 = new Product2("Macbook Pro M2", 19000000);
    
    Set<Product2> set = new HashSet<>();
    set.add(product);
    set.add(product1);
    System.out.println(product);
    System.out.println(set.size());
  }
}
