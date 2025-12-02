package oop.application.data;

public class Cat extends Animal{
  public Cat(String targetName){
    this.name = targetName;
  }
  @Override
  public void run() {
    System.out.println("This cat with the name " + this.name + " can run so faster then me as a owner!");
  }
}
