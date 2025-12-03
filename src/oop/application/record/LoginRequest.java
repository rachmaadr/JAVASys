package oop.application.record;

public record LoginRequest(String username, String password) {
  public LoginRequest{
    System.out.println("Call Main Constructor");
  }
  public LoginRequest(String username){
    this(username, "");
  }
}
