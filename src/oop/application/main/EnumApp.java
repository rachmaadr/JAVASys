package oop.application.main;

import oop.application.data.Customer;
import oop.application.enums.CustomerLevel;

public class EnumApp {
  public static void main(String[] args) {
    Customer customer = new Customer();
    customer.setLevel(CustomerLevel.Pro);
    System.out.println(customer.getLevel());
  }
}
