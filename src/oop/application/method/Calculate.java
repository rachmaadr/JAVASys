package oop.application.method;

public class Calculate {
  Product product;
  protected int quantity;
  Calculate(Product targetProduct, int targetQuantity){
    this.product = targetProduct;
    this.quantity = targetQuantity;
  }

  int sum(){
    return product.price * quantity;
  }
}
