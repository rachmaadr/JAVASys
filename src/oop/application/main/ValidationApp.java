package oop.application.main;

import oop.application.error.ValidationException;
import oop.application.record.LoginRequest;
import oop.application.utils.ValidationUtil;

public class ValidationApp {
  public static void main(String[] args) {
    LoginRequest loginRequest = new LoginRequest(null, null);
    try {
      ValidationUtil.validate(loginRequest);
      System.out.println("Data Valid");
    } catch (ValidationException e) {
      System.out.println("Terjadi error dengan pesan: " + e.getMessage());
    } catch (NullPointerException e) {
      System.out.println("Error message:" + e.getMessage());
    }finally{
      System.out.println("Aplikasi sudah dijalankan");
    }
  }
}
