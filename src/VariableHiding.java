class Parent {
  String name;
  void getParentClass(){
    System.out.println("Do it from parent");
  }
}

class Child extends Parent{
  String name;
  void getChildClass(){
    System.out.println("Do it now from child");
  }
}
