package oop.application.main;

import oop.application.data.Database;
import oop.application.error.DatabaseError;

public class DatabaseApp {
  public static void main(String[] args) {

    try (Database database = new Database("Adminitrator", "password")) {
      database.connect();
    } catch (DatabaseError e) {
      e.printStackTrace();
    }
  }
}
