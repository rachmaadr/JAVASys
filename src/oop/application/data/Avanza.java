package oop.application.data;

import oop.application.contract.IsMaintenance;

public class Avanza implements IsMaintenance{
  public void Drive(){
    System.out.println("Drive with avanza");
  }
  public int getTire(int tire){
    return tire;
  }
  public String getBrand(String name){
    return name;
  }
}
