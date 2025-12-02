package oop.application.method;

import java.util.Objects;

public class Product2 {
  public String name;
  public int price;

  public Product2(String targetName, int targetPrice) {
    this.name = targetName;
    this.price = targetPrice;
  }

  public String toString() {
    return "Product name : " + this.name + ", price: " + this.price;
  }

  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof Product2)) {
      return false;
    }
    Product2 product2 = (Product2) o;
    if (price != product2.price) {
      return false;
    }
    return name != null ? name.equals(product2.name) : product2.name == null;
  }

  public int hashCode(){
    // int result = name != null ? name.hashCode() : 0;
    // result = 31 * result + price;
    // return result;
    return Objects.hash(name,price);
  }
}
