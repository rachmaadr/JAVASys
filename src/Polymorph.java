class Car {
  String brand;
  String model;
  int year;

  Car(String paramBrand, String paramModel, int paramYear) {
    this.brand = paramBrand;
    this.model = paramModel;
    this.year = paramYear;
  }

  void drive() {
    System.out.println("Driving the car");
  }
}

class Truck extends Car {
  int capacity;
  String driverName;

  Truck(String paramBrand, String paramModel, int paramYear, int paramCapacity, String paramDriver) {
    super(paramBrand, paramModel, paramYear);
    this.capacity = paramCapacity;
    this.driverName = paramDriver;
  }

  void drive() {
    System.out.println("Driving the truck from brand " + this.brand + " with model " + this.model + " release on "
        + this.year + " year.");
  }
}

class Bus extends Truck {
  Bus(String paramBrand, String paramModel, int paramYear, int paramCapacity, String paramDriver) {
    super(paramBrand, paramModel, paramYear, paramCapacity, paramDriver);
  }

  void drive() {
    System.out.println("Driving the bus from brand " + this.brand + " with driver name is " + this.driverName
        + " and capacity is " + this.capacity + " seat.");
  }
}