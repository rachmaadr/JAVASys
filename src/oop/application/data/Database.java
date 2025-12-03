package oop.application.data;

import oop.application.error.DatabaseError;

public class Database implements AutoCloseable {

  private String username;
  private String password;
  private boolean connected = false;

  public Database(String username, String password) {
    this.username = username;
    this.password = password;
  }

  public String getUsername() {
    return username;
  }

  public String getPassword() {
    return password;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public void connect() {
    if (username == null || password == null) {
      throw new DatabaseError("Failed connect to database: username or passowrd is null");
    }
    connected = true;
    System.out.println("Database connected");
  }

  public void close() {
    if (connected) {

      System.out.println("Database connection closed.");
      connected = false;
    } else {
      System.out.println("No connection to close");
    }
  }
}