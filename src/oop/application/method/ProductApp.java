package oop.application.method;

public class ProductApp {
  public static void main(String[] args) {
    Product product = new Product("LPG", 19000);
    Calculate calculate = new Calculate(product, 3);

    System.out.println("Nama Produk: " + product.name);
    System.out.println("Harga: " + product.price);
    System.out.println("Quantity: " + calculate.quantity);
    System.out.println("Total Harga: " + calculate.sum());
  }
}
