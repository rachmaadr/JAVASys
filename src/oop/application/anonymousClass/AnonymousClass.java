package oop.application.anonymousClass;

import oop.application.contract.HelloWorld;

public class AnonymousClass{
  public static void main(String[] args) {
    HelloWorld english = new HelloWorld() {
      @Override
      public void sayHello() {
        System.out.println("Hello");
      }

      @Override
      public void sayHello(String name) {
        System.out.println("Hello " + name);
      }
    };
    english.sayHello("Jhon Doe");
  }
}
