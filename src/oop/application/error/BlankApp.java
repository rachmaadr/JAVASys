package oop.application.error;

import oop.application.record.LoginRequest;
import oop.application.utils.ValidationBlank;

public class BlankApp {
  public static void main(String[] args) {
    LoginRequest login = new LoginRequest("Username", "null");
    ValidationBlank.validationRuntime(login);
    System.out.println("Data Valid");
  }
}
