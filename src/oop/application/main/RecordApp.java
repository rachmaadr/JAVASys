package oop.application.main;

import oop.application.record.LoginRequest;

public class RecordApp {
  public static void main(String[] args) {
    LoginRequest login = new LoginRequest("Allice", "12345");
    System.out.println(login.username());
    System.out.println(login.password());
    System.out.println(login);
  }
}
