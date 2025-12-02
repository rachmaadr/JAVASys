package oop.application.main;

import oop.application.data.Avanza;

public class CarApp {
  public static void main(String[] args) {
    Avanza car = new Avanza();
    car.Drive();
    System.out.println(car.getBrand("Avanza"));
    System.out.println(car.getTire(4));
    System.out.println(car.isMaintenance());
  }
}
