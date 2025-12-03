package oop.application.main;

public class test {
public static void main(String[] args) {
  try {
    String[] names = {
      "Jhon Doe", "Allice", "Ribert"
    };
    System.out.println(names.length);
  } catch (Throwable throwable) {
    throwable.printStackTrace();
  }
}
}
