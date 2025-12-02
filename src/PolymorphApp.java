public class PolymorphApp {
  public static void main(String[] args) {
    Car mercy = new Car("Mercedes Benz", "GLA", 2020);
    mercy.drive();

    Truck ford = new Truck("Ford", "F150", 2020, 10, "John Doe");
    ford.drive();

    Bus fuso = new Bus("Mitsubishi Fuso", "Big Bus", 2020, 25, "Alex");
    fuso.drive();
  }
}
