package oop.application.stats;

public class InnerClass {
  public class Country {
    public String name;

    public static class City {
      private String name;

      public String getName() {
        return name;
      }

      public void setName(String name) {
        this.name = name;
      }

      public String toString() {
        return "City Name: " + this.name;
      }
    }
  }
}
