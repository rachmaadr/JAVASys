package oop.application.data;

import oop.application.enums.CustomerLevel;

public class Customer {
  private CustomerLevel level;
  // public Customer(CustomerLevel targetLevel){
  //   this.level = targetLevel;
  // }
  public CustomerLevel getLevel(){
    return level;
  }
  public void setLevel(CustomerLevel targetLevel){
    this.level = targetLevel;
  }
}
