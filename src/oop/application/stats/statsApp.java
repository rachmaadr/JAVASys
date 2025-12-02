package oop.application.stats;

public class statsApp {
  public static void main(String[] args) {
    System.out.println(staticClass.drink = "Matcha");
    int result = MathUtils.sum(90, 100);
    System.out.println(result);
    InnerClass.Country.City cityName = new InnerClass.Country.City();
    cityName.setName("Djakartah");
    System.out.println(cityName);
  }
}
