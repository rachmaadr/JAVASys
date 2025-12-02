package oop.application.main;

import oop.application.encapsulation.Category;

public class CategoryApp {
  public static void main(String[] args) {
    Category category = new Category("90", true);
    category.setId("ID");
    category.setId(null);
    System.out.println(category.getId());
  }
}
